package codeflies.com.saalimmvvm.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import codeflies.com.saalimmvvm.R
import codeflies.com.saalimmvvm.adapter.HistoryProductAdapter
import codeflies.com.saalimmvvm.databinding.FragmentShowHistoryProductBinding
import com.example.interviewtask.db.DatabaseHelper


class ShowHistoryProductFragment : Fragment(R.layout.fragment_show_history_product) {

    private lateinit var binding: FragmentShowHistoryProductBinding
    private lateinit var historyProductAdapter: HistoryProductAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentShowHistoryProductBinding.bind(view)

        // Initialize RecyclerView
        historyProductAdapter =
            HistoryProductAdapter(listOf(), requireContext()) // Pass an empty list initially
        binding.recyclerView.apply {
            adapter = historyProductAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        // Load data from database
        loadDataFromDatabase()
    }

    private fun loadDataFromDatabase() {
        val databaseHelper = DatabaseHelper(requireContext())
        val items =
            databaseHelper.getAllDataFromDatabase() // Implement this method in your DatabaseHelper
        historyProductAdapter.setItems(items)
    }
}
