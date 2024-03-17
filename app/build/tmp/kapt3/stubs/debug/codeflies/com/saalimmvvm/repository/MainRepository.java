package codeflies.com.saalimmvvm.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcodeflies/com/saalimmvvm/repository/MainRepository;", "", "apiService", "Lcodeflies/com/saalimmvvm/network/ApiService;", "(Lcodeflies/com/saalimmvvm/network/ApiService;)V", "getHomePosts", "Lcodeflies/com/saalimmvvm/model/responseClass/home/HomeResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMaintenancePosts", "Lcodeflies/com/saalimmvvm/model/responseClass/maintenance/MaintenanceResponse;", "getpost", "", "Lcodeflies/com/saalimmvvm/model/PostResultItem;", "app_debug"})
public final class MainRepository {
    @org.jetbrains.annotations.NotNull
    private final codeflies.com.saalimmvvm.network.ApiService apiService = null;
    
    public MainRepository(@org.jetbrains.annotations.NotNull
    codeflies.com.saalimmvvm.network.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getpost(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<codeflies.com.saalimmvvm.model.PostResultItem>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getHomePosts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super codeflies.com.saalimmvvm.model.responseClass.home.HomeResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getMaintenancePosts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super codeflies.com.saalimmvvm.model.responseClass.maintenance.MaintenanceResponse> $completion) {
        return null;
    }
}