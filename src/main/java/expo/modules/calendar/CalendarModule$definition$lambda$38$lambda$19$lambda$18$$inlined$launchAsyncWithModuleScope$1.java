package expo.modules.calendar;

import expo.modules.core.arguments.ReadableArguments;
import expo.modules.core.errors.InvalidArgumentException;
import expo.modules.kotlin.Promise;
import java.text.ParseException;
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
@DebugMetadata(c = "expo.modules.calendar.CalendarModule$definition$lambda$38$lambda$19$lambda$18$$inlined$launchAsyncWithModuleScope$1", f = "CalendarModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CalendarModule$definition$lambda$38$lambda$19$lambda$18$$inlined$launchAsyncWithModuleScope$1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    final /* synthetic */ ReadableArguments $details$inlined;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ Promise $promise$inlined;
    int label;
    final /* synthetic */ CalendarModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarModule$definition$lambda$38$lambda$19$lambda$18$$inlined$launchAsyncWithModuleScope$1(Promise promise, Continuation continuation, CalendarModule calendarModule, ReadableArguments readableArguments, Promise promise2) {
        super(2, continuation);
        this.$promise = promise;
        this.this$0 = calendarModule;
        this.$details$inlined = readableArguments;
        this.$promise$inlined = promise2;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new CalendarModule$definition$lambda$38$lambda$19$lambda$18$$inlined$launchAsyncWithModuleScope$1(this.$promise, continuation, this.this$0, this.$details$inlined, this.$promise$inlined);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        try {
            try {
                this.$promise$inlined.resolve(String.valueOf(this.this$0.saveEvent(this.$details$inlined)));
            } catch (EventNotSavedException e11) {
                this.$promise$inlined.reject("E_EVENT_NOT_SAVED", "Event could not be saved", e11);
            } catch (InvalidArgumentException e12) {
                this.$promise$inlined.reject("E_EVENT_NOT_SAVED", "Event could not be saved", e12);
            } catch (ParseException e13) {
                this.$promise$inlined.reject("E_EVENT_NOT_SAVED", "Event could not be saved", e13);
            }
        } catch (ModuleDestroyedException unused) {
            this.$promise.reject("E_CALENDAR_MODULE_DESTROYED", "Module destroyed, promise canceled", null);
        }
        return h0.f84049a;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((CalendarModule$definition$lambda$38$lambda$19$lambda$18$$inlined$launchAsyncWithModuleScope$1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
