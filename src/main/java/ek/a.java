package ek;

import fk.b;
import fk.c;
import gk.c1;
import gk.f1;
import gk.j;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lek/a;", "", "", "apiKey", "countryCode", "", "testMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lfk/a;", "card", "Lkotlin/Function1;", "Lfk/b;", "Ljn0/h0;", "onSuccess", "Lfk/c;", "onError", "a", "(Lfk/a;Lwn0/l;Lwn0/l;)V", "sdk_release"}, k = 1, mv = {1, 9, 0})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f63020a;

    public a(String apiKey, String countryCode, boolean z11) {
        s.k(apiKey, "apiKey");
        s.k(countryCode, "countryCode");
        this.f63020a = new f1(new j(apiKey, countryCode, z11));
    }

    public final void a(fk.a card, l<? super b, h0> onSuccess, l<? super c, h0> onError) {
        s.k(card, "card");
        s.k(onSuccess, "onSuccess");
        s.k(onError, "onError");
        f1 f1Var = this.f63020a;
        f1Var.getClass();
        s.k(card, "card");
        s.k(onSuccess, "onSuccess");
        s.k(onError, "onError");
        BuildersKt__Builders_commonKt.launch$default(f1Var.f69055c, null, null, new c1(f1Var, onError, card, onSuccess, null), 3, null);
    }
}
