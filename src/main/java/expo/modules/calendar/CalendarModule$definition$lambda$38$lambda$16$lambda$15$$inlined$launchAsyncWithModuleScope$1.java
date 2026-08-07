package expo.modules.calendar;

import android.os.Bundle;
import expo.modules.kotlin.Promise;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V", "expo/modules/calendar/CalendarModule$launchAsyncWithModuleScope$1"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "expo.modules.calendar.CalendarModule$definition$lambda$38$lambda$16$lambda$15$$inlined$launchAsyncWithModuleScope$1", f = "CalendarModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CalendarModule$definition$lambda$38$lambda$16$lambda$15$$inlined$launchAsyncWithModuleScope$1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    final /* synthetic */ String $eventID$inlined;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ Promise $promise$inlined;
    int label;
    final /* synthetic */ CalendarModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarModule$definition$lambda$38$lambda$16$lambda$15$$inlined$launchAsyncWithModuleScope$1(Promise promise, Continuation continuation, CalendarModule calendarModule, String str, Promise promise2) {
        super(2, continuation);
        this.$promise = promise;
        this.this$0 = calendarModule;
        this.$eventID$inlined = str;
        this.$promise$inlined = promise2;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new CalendarModule$definition$lambda$38$lambda$16$lambda$15$$inlined$launchAsyncWithModuleScope$1(this.$promise, continuation, this.this$0, this.$eventID$inlined, this.$promise$inlined);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        try {
            Bundle bundleFindEventById = this.this$0.findEventById(this.$eventID$inlined);
            if (bundleFindEventById != null) {
                this.$promise$inlined.resolve(bundleFindEventById);
            } else {
                this.$promise$inlined.reject("E_EVENT_NOT_FOUND", "Event with id " + this.$eventID$inlined + " could not be found", null);
            }
        } catch (ModuleDestroyedException unused) {
            this.$promise.reject("E_CALENDAR_MODULE_DESTROYED", "Module destroyed, promise canceled", null);
        }
        return h0.f84049a;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((CalendarModule$definition$lambda$38$lambda$16$lambda$15$$inlined$launchAsyncWithModuleScope$1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
