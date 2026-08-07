package com.plaid.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/plaid/internal/LinkRedirectActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LinkRedirectActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.p003lifecycle.e1 f46432a = new androidx.p003lifecycle.e1(p013kotlin.jvm.internal.o0.b(K2.class), new b(), new a(), new c());

    public static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ViewModelProvider.Factory> {
        public a() {
            super(0);
        }

        @Override // wn0.a
        public final ViewModelProvider.Factory invoke() {
            return LinkRedirectActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends p013kotlin.jvm.internal.u implements wn0.a<ViewModelStore> {
        public b() {
            super(0);
        }

        @Override // wn0.a
        public final ViewModelStore invoke() {
            return LinkRedirectActivity.this.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    public static final class c extends p013kotlin.jvm.internal.u implements wn0.a<CreationExtras> {
        public c() {
            super(0);
        }

        @Override // wn0.a
        public final CreationExtras invoke() {
            return LinkRedirectActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        K2 k11 = (K2) this.f46432a.getValue();
        Intent intent = getIntent();
        p013kotlin.jvm.internal.s.j(intent, "getIntent(...)");
        k11.getClass();
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(this, "activity");
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(k11), null, null, new J2(this, K2.a(intent.getData()), null), 3, null);
        finish();
    }
}
