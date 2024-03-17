package codeflies.com.saalimmvvm.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001c\u001a\u00020\u001aR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcodeflies/com/saalimmvvm/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcodeflies/com/saalimmvvm/repository/MainRepository;", "(Lcodeflies/com/saalimmvvm/repository/MainRepository;)V", "_loading", "Landroidx/lifecycle/MutableLiveData;", "", "_postdata", "", "Lcodeflies/com/saalimmvvm/model/PostResultItem;", "_postdataHomeresponse", "Lcodeflies/com/saalimmvvm/model/responseClass/home/HomeResponse;", "_postdataMaintainresponse", "Lcodeflies/com/saalimmvvm/model/responseClass/maintenance/MaintenanceResponse;", "loading", "Landroidx/lifecycle/LiveData;", "getLoading", "()Landroidx/lifecycle/LiveData;", "postdata", "getPostdata", "postdataHomeresponse", "getPostdataHomeresponse", "postdataMaintainresponse", "getPostdataMaintainresponse", "getpost", "", "getpostHome", "getpostMainta", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final codeflies.com.saalimmvvm.repository.MainRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<codeflies.com.saalimmvvm.model.PostResultItem>> _postdata;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _loading;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<codeflies.com.saalimmvvm.model.responseClass.home.HomeResponse> _postdataHomeresponse;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<codeflies.com.saalimmvvm.model.responseClass.maintenance.MaintenanceResponse> _postdataMaintainresponse;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull
    codeflies.com.saalimmvvm.repository.MainRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<codeflies.com.saalimmvvm.model.PostResultItem>> getPostdata() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<codeflies.com.saalimmvvm.model.responseClass.home.HomeResponse> getPostdataHomeresponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<codeflies.com.saalimmvvm.model.responseClass.maintenance.MaintenanceResponse> getPostdataMaintainresponse() {
        return null;
    }
    
    public final void getpost() {
    }
    
    public final void getpostHome() {
    }
    
    public final void getpostMainta() {
    }
}