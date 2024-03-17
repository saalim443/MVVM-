package codeflies.com.saalimmvvm.Cart

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import codeflies.com.saalimmvvm.R
import codeflies.com.saalimmvvm.databinding.ActivityShowDataBinding
import io.reactivex.rxjava3.disposables.CompositeDisposable
import com.jakewharton.rxbinding4.view.clicks


class ShowDataActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var binding: ActivityShowDataBinding
    private lateinit var appBarConfiguration: AppBarConfiguration
    private val disposables = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowDataBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.contentLayout) as NavHostFragment
        navController = navHostFragment.navController
        setSupportActionBar(binding.toolbar)
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.home2, // Replace with your fragment IDs
                R.id.profile,
            ),
            binding.drawerlayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        // Link BottomNavigationView with NavController
        binding.bottomNavigation.setupWithNavController(navController)
        binding.navigationView.setupWithNavController(navController)

//        binding.imgShowproduct.setOnClickListener {
//            navController.navigate(R.id.showHistoryProductFragment)
//        }
        // Bind item selections for bottomNavigation using RxBinding

        disposables.add(binding.imgShowproduct.clicks().subscribe {
            navController.navigate(R.id.showHistoryProductFragment)
        })


    }

    fun hideNavigattion() {
        binding.bottomNavigation.visibility = View.GONE
    }

     fun showcarticon(){
        binding.imgShowproduct.visibility=View.VISIBLE
    }
     fun hideCartIcon(){
        binding.imgShowproduct.visibility=View.GONE
    }


    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.contentLayout)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
    }

}