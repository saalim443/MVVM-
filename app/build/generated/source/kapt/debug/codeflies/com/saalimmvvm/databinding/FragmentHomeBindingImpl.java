package codeflies.com.saalimmvvm.databinding;
import codeflies.com.saalimmvvm.R;
import codeflies.com.saalimmvvm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.lnrtop, 1);
        sViewsWithIds.put(R.id.cvviewpager, 2);
        sViewsWithIds.put(R.id.viewPager, 3);
        sViewsWithIds.put(R.id.rvVVVV, 4);
        sViewsWithIds.put(R.id.rvAllCate, 5);
        sViewsWithIds.put(R.id.lnrTwo, 6);
        sViewsWithIds.put(R.id.rvTopCategoryArray, 7);
        sViewsWithIds.put(R.id.txtSlider2, 8);
        sViewsWithIds.put(R.id.cvviewpager2, 9);
        sViewsWithIds.put(R.id.viewPager2, 10);
        sViewsWithIds.put(R.id.recyclerMaintainence, 11);
        sViewsWithIds.put(R.id.progressBar, 12);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (androidx.cardview.widget.CardView) bindings[6]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.ProgressBar) bindings[12]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (androidx.viewpager.widget.ViewPager) bindings[3]
            , (androidx.viewpager.widget.ViewPager) bindings[10]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewmodel == variableId) {
            setViewmodel((codeflies.com.saalimmvvm.viewmodel.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable codeflies.com.saalimmvvm.viewmodel.MainViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}