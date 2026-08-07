package com.stripe.android.model;

import android.os.Parcelable;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/q1;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/p1$c;", "tokenType", "", "", "attribution", "<init>", "(Lcom/stripe/android/model/p1$c;Ljava/util/Set;)V", "", "", "c3", "()Ljava/util/Map;", "a", "Lcom/stripe/android/model/p1$c;", "b", "()Lcom/stripe/android/model/p1$c;", "Ljava/util/Set;", "()Ljava/util/Set;", "c", "typeDataParams", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class q1 implements o1, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Token.c tokenType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Set<String> attribution;

    public q1(Token.c tokenType, Set<String> attribution) {
        p013kotlin.jvm.internal.s.k(tokenType, "tokenType");
        p013kotlin.jvm.internal.s.k(attribution, "attribution");
        this.tokenType = tokenType;
        this.attribution = attribution;
    }

    public final Set<String> a() {
        return this.attribution;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Token.c getTokenType() {
        return this.tokenType;
    }

    public abstract Map<String, Object> c();

    @Override // com.stripe.android.model.o1
    public Map<String, Object> c3() {
        return p013kotlin.collections.v0.f(jn0.x.a(this.tokenType.getCode(), c()));
    }

    public /* synthetic */ q1(Token.c cVar, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, (i11 & 2) != 0 ? p013kotlin.collections.d1.d() : set);
    }
}
