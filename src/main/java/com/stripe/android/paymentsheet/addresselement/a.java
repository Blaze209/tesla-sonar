package com.stripe.android.paymentsheet.addresselement;

import androidx.p003lifecycle.s0;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p011ja.n;
import p011ja.w;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0003R$\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR0\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/a;", "", "<init>", "()V", "Lcom/stripe/android/paymentsheet/addresselement/b;", "target", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/paymentsheet/addresselement/b;)Ljn0/h0;", "", Action.KEY_ATTRIBUTE, "value", "h", "(Ljava/lang/String;Ljava/lang/Object;)Ljn0/h0;", "T", "Lkotlinx/coroutines/flow/Flow;", "c", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Lcom/stripe/android/paymentsheet/addresselement/e;", "result", "a", "(Lcom/stripe/android/paymentsheet/addresselement/e;)V", "e", "Lja/w;", "Lja/w;", "getNavigationController", "()Lja/w;", "f", "(Lja/w;)V", "navigationController", "Lkotlin/Function1;", "b", "Lwn0/l;", "getOnDismiss", "()Lwn0/l;", "g", "(Lwn0/l;)V", "onDismiss", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f52379d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private w navigationController;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super e, h0> onDismiss;

    public static /* synthetic */ void b(a aVar, e eVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eVar = e.a.f52403a;
        }
        aVar.a(eVar);
    }

    public final void a(e result) {
        s.k(result, "result");
        wn0.l<? super e, h0> lVar = this.onDismiss;
        if (lVar != null) {
            lVar.invoke(result);
        }
    }

    public final <T> Flow<T> c(String key) {
        p011ja.k kVarD;
        s.k(key, "key");
        w wVar = this.navigationController;
        if (wVar == null || (kVarD = wVar.D()) == null) {
            return null;
        }
        return FlowKt.filterNotNull(kVarD.h().i(key, null));
    }

    public final h0 d(b target) {
        s.k(target, "target");
        w wVar = this.navigationController;
        if (wVar == null) {
            return null;
        }
        n.V(wVar, target.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, 6, null);
        return h0.f84049a;
    }

    public final void e() {
        w wVar = this.navigationController;
        if (wVar == null || wVar.Y()) {
            return;
        }
        b(this, null, 1, null);
    }

    public final void f(w wVar) {
        this.navigationController = wVar;
    }

    public final void g(wn0.l<? super e, h0> lVar) {
        this.onDismiss = lVar;
    }

    public final h0 h(String key, Object value) {
        p011ja.k kVarK;
        s0 s0VarH;
        s.k(key, "key");
        w wVar = this.navigationController;
        if (wVar == null || (kVarK = wVar.K()) == null || (s0VarH = kVarK.h()) == null) {
            return null;
        }
        s0VarH.n(key, value);
        return h0.f84049a;
    }
}
