package ei0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import p013kotlin.Metadata;
import zg0.ScreenState;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8&X¦\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"Lei0/e;", "", "Lkotlinx/coroutines/flow/Flow;", "Lei0/a;", "c", "()Lkotlinx/coroutines/flow/Flow;", "controllerRequestFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lzg0/d;", "b", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getScreenStateFlow$annotations", "()V", "screenStateFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lzg0/c;", "a", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "getEventFlow$annotations", "eventFlow", "", DateTokenConverter.CONVERTER_KEY, "()Z", "isNavBarEnabled", "e", "handleBackPress", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface e {
    MutableSharedFlow<zg0.c> a();

    MutableStateFlow<ScreenState> b();

    Flow<a> c();

    boolean d();

    boolean e();
}
