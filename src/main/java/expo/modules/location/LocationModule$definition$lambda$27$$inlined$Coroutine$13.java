package expo.modules.location;

import android.content.Context;
import com.google.android.gms.location.LocationRequest;
import expo.modules.location.records.LocationOptions;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.SafeContinuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", "", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.location.LocationModule$definition$lambda$27$$inlined$Coroutine$13", f = "LocationModule.kt", i = {0}, l = {28}, m = "invokeSuspend", n = {"locationRequest"}, s = {"L$0"})
public final class LocationModule$definition$lambda$27$$inlined$Coroutine$13 extends SuspendLambda implements q<CoroutineScope, Object[], Continuation<? super Object>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LocationModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationModule$definition$lambda$27$$inlined$Coroutine$13(Continuation continuation, LocationModule locationModule) {
        super(3, continuation);
        this.this$0 = locationModule;
    }

    @Override // wn0.q
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return obj;
        }
        t.b(obj);
        LocationHelpers.Companion companion = LocationHelpers.INSTANCE;
        Context context = this.this$0.mContext;
        if (context == null) {
            s.B("mContext");
            context = null;
        }
        if (companion.hasNetworkProviderEnabled(context)) {
            return null;
        }
        LocationRequest locationRequestPrepareLocationRequest$expo_location_release = companion.prepareLocationRequest$expo_location_release(new LocationOptions(0, null, false, null, 15, null));
        this.L$0 = locationRequestPrepareLocationRequest$expo_location_release;
        this.L$1 = this;
        this.label = 1;
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
        this.this$0.addPendingLocationRequest(locationRequestPrepareLocationRequest$expo_location_release, new LocationActivityResultListener() { // from class: expo.modules.location.LocationModule$definition$1$16$1$1
            @Override // expo.modules.location.LocationActivityResultListener
            public void onResult(int resultCode) {
                if (resultCode == -1) {
                    safeContinuation.resumeWith(jn0.s.b(null));
                    return;
                }
                Continuation<String> continuation = safeContinuation;
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                continuation.resumeWith(jn0.s.b(t.a(new LocationSettingsUnsatisfiedException())));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        return orThrow == coroutine_suspended ? coroutine_suspended : orThrow;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
        return new LocationModule$definition$lambda$27$$inlined$Coroutine$13(continuation, this.this$0).invokeSuspend(h0.f84049a);
    }
}
