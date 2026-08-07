package expo.modules.calendar;

import expo.modules.calendar.dialogs.CreateEventContract;
import expo.modules.calendar.dialogs.ViewEventContract;
import expo.modules.kotlin.activityresult.AppContextActivityResultCaller;
import expo.modules.kotlin.activityresult.AppContextActivityResultLauncher;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;", "Ljn0/h0;", "<anonymous>", "(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "expo.modules.calendar.CalendarModule$definition$1$1", f = "CalendarModule.kt", i = {0}, l = {52, 55}, m = "invokeSuspend", n = {"$this$RegisterActivityContracts"}, s = {"L$0"})
final class CalendarModule$definition$1$1 extends SuspendLambda implements p<AppContextActivityResultCaller, Continuation<? super h0>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CalendarModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CalendarModule$definition$1$1(CalendarModule calendarModule, Continuation<? super CalendarModule$definition$1$1> continuation) {
        super(2, continuation);
        this.this$0 = calendarModule;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        CalendarModule$definition$1$1 calendarModule$definition$1$1 = new CalendarModule$definition$1$1(this.this$0, continuation);
        calendarModule$definition$1$1.L$0 = obj;
        return calendarModule$definition$1$1;
    }

    @Override // wn0.p
    public final Object invoke(AppContextActivityResultCaller appContextActivityResultCaller, Continuation<? super h0> continuation) {
        return ((CalendarModule$definition$1$1) create(appContextActivityResultCaller, continuation)).invokeSuspend(h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CalendarModule calendarModule;
        CalendarModule$definition$1$1 calendarModule$definition$1$1;
        AppContextActivityResultCaller appContextActivityResultCaller;
        CalendarModule calendarModule2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                calendarModule = (CalendarModule) this.L$1;
                AppContextActivityResultCaller appContextActivityResultCaller2 = (AppContextActivityResultCaller) this.L$0;
                t.b(obj);
                calendarModule$definition$1$1 = this;
                appContextActivityResultCaller = appContextActivityResultCaller2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                calendarModule2 = (CalendarModule) this.L$0;
                t.b(obj);
            }
            calendarModule2.viewEventLauncher = (AppContextActivityResultLauncher) obj;
            return h0.f84049a;
        }
        t.b(obj);
        AppContextActivityResultCaller appContextActivityResultCaller3 = (AppContextActivityResultCaller) this.L$0;
        calendarModule = this.this$0;
        CreateEventContract createEventContract = new CreateEventContract();
        this.L$0 = appContextActivityResultCaller3;
        this.L$1 = calendarModule;
        this.label = 1;
        calendarModule$definition$1$1 = this;
        obj = AppContextActivityResultCaller.DefaultImpls.registerForActivityResult$default(appContextActivityResultCaller3, createEventContract, null, calendarModule$definition$1$1, 2, null);
        if (obj != coroutine_suspended) {
            appContextActivityResultCaller = appContextActivityResultCaller3;
        }
        return coroutine_suspended;
        calendarModule.createEventLauncher = (AppContextActivityResultLauncher) obj;
        CalendarModule calendarModule3 = calendarModule$definition$1$1.this$0;
        ViewEventContract viewEventContract = new ViewEventContract();
        calendarModule$definition$1$1.L$0 = calendarModule3;
        calendarModule$definition$1$1.L$1 = null;
        calendarModule$definition$1$1.label = 2;
        Object objRegisterForActivityResult$default = AppContextActivityResultCaller.DefaultImpls.registerForActivityResult$default(appContextActivityResultCaller, viewEventContract, null, this, 2, null);
        if (objRegisterForActivityResult$default != coroutine_suspended) {
            calendarModule2 = calendarModule3;
            obj = objRegisterForActivityResult$default;
            calendarModule2.viewEventLauncher = (AppContextActivityResultLauncher) obj;
            return h0.f84049a;
        }
        return coroutine_suspended;
    }
}
