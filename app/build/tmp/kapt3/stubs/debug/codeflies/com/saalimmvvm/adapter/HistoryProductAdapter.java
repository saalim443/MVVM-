package codeflies.com.saalimmvvm.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcodeflies/com/saalimmvvm/adapter/HistoryProductAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcodeflies/com/saalimmvvm/adapter/HistoryProductAdapter$ItemViewHolder;", "items", "", "Lcodeflies/com/saalimmvvm/model/Item;", "requireActivity", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "ItemViewHolder", "app_debug"})
public final class HistoryProductAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<codeflies.com.saalimmvvm.adapter.HistoryProductAdapter.ItemViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<codeflies.com.saalimmvvm.model.Item> items;
    @org.jetbrains.annotations.NotNull
    private final android.content.Context requireActivity = null;
    
    public HistoryProductAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<codeflies.com.saalimmvvm.model.Item> items, @org.jetbrains.annotations.NotNull
    android.content.Context requireActivity) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public codeflies.com.saalimmvvm.adapter.HistoryProductAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    codeflies.com.saalimmvvm.adapter.HistoryProductAdapter.ItemViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull
    java.util.List<codeflies.com.saalimmvvm.model.Item> items) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcodeflies/com/saalimmvvm/adapter/HistoryProductAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcodeflies/com/saalimmvvm/databinding/ItemHistoryProductBinding;", "(Lcodeflies/com/saalimmvvm/adapter/HistoryProductAdapter;Lcodeflies/com/saalimmvvm/databinding/ItemHistoryProductBinding;)V", "bind", "", "item", "Lcodeflies/com/saalimmvvm/model/Item;", "app_debug"})
    public final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final codeflies.com.saalimmvvm.databinding.ItemHistoryProductBinding binding = null;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull
        codeflies.com.saalimmvvm.databinding.ItemHistoryProductBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        codeflies.com.saalimmvvm.model.Item item) {
        }
    }
}