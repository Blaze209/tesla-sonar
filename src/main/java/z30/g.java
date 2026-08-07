package z30;

import androidx.work.s0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004H\u0096B¢\u0006\u0004\b\t\u0010\nR*\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lz30/g;", "Lz30/e;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "isEnabledForMerchant", "<init>", "(Lwn0/l;)V", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwn0/l;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<Continuation<? super Boolean>, Object> isEnabledForMerchant;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.utils.RealIsWorkManagerAvailable", f = "IsWorkManagerAvailable.kt", i = {0}, l = {21}, m = "invoke", n = {"workManagerInClasspath"}, s = {"Z$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f126814n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f126815o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f126817q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f126815o = obj;
            this.f126817q |= Integer.MIN_VALUE;
            return g.this.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(l<? super Continuation<? super Boolean>, ? extends Object> isEnabledForMerchant) {
        s.k(isEnabledForMerchant, "isEnabledForMerchant");
        this.isEnabledForMerchant = isEnabledForMerchant;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z30.e
    public Object a(Continuation<? super Boolean> continuation) {
        a aVar;
        Object objB;
        boolean z11;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f126817q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f126817q = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f126815o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f126817q;
        if (i12 == 0) {
            t.b(obj);
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                s0.Companion companion2 = s0.INSTANCE;
                objB = jn0.s.b(s0.class);
            } catch (Throwable th2) {
                jn0.s.Companion companion3 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th2));
            }
            boolean zH = jn0.s.h(objB);
            l<Continuation<? super Boolean>, Object> lVar = this.isEnabledForMerchant;
            aVar.f126814n = zH;
            aVar.f126817q = 1;
            Object objInvoke = lVar.invoke(aVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            z11 = zH;
            obj = objInvoke;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = aVar.f126814n;
            t.b(obj);
        }
        return Boxing.boxBoolean(((Boolean) obj).booleanValue() && z11 && s0.h());
    }
}
