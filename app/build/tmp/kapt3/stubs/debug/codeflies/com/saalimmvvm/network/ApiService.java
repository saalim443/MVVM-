package codeflies.com.saalimmvvm.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001b\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001b\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcodeflies/com/saalimmvvm/network/ApiService;", "", "getPost", "", "Lcodeflies/com/saalimmvvm/model/PostResultItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPostHome", "Lcodeflies/com/saalimmvvm/model/responseClass/home/HomeResponse;", "token", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPostMaintain", "Lcodeflies/com/saalimmvvm/model/responseClass/maintenance/MaintenanceResponse;", "app_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.GET(value = "posts")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPost(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<codeflies.com.saalimmvvm.model.PostResultItem>> $completion);
    
    @retrofit2.http.GET(value = "api/home")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPostHome(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super codeflies.com.saalimmvvm.model.responseClass.home.HomeResponse> $completion);
    
    @retrofit2.http.GET(value = "api/home/maintenance")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPostMaintain(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super codeflies.com.saalimmvvm.model.responseClass.maintenance.MaintenanceResponse> $completion);
}