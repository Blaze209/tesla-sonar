package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.fragment.app.r0;
import androidx.p002activity.ComponentActivity;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.e1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import bh0.b0;
import bh0.n2;
import com.withpersona.sdk2.inquiry.internal.InquiryActivity;
import jn0.h0;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0003R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ljn0/h0;", "s", "(Landroid/os/Bundle;)V", "", "u", "()Z", "Landroid/content/Context;", "base", "attachBaseContext", "(Landroid/content/Context;)V", "onCreate", "onPause", "onDestroy", "onResume", "Lcom/withpersona/sdk2/inquiry/internal/h;", "f", "Lkotlin/Lazy;", "q", "()Lcom/withpersona/sdk2/inquiry/internal/h;", "args", "Lbh0/b0;", "g", "r", "()Lbh0/b0;", "viewModel", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InquiryActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy args = jn0.m.b(new wn0.a() { // from class: bh0.j
        @Override // wn0.a
        public final Object invoke() {
            return InquiryActivity.p(this.f17275a);
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e1(o0.b(b0.class), new b(this), new a(this), new c(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {2, 0, 0})
    public static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f57529c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentActivity componentActivity) {
            super(0);
            this.f57529c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return this.f57529c.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelStore;", "b", "()Landroidx/lifecycle/ViewModelStore;"}, k = 3, mv = {2, 0, 0})
    public static final class b extends p013kotlin.jvm.internal.u implements wn0.a<ViewModelStore> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f57530c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f57530c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f57530c.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {2, 0, 0})
    public static final class c extends p013kotlin.jvm.internal.u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f57531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f57532d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wn0.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f57531c = aVar;
            this.f57532d = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f57531c;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f57532d.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h p(InquiryActivity inquiryActivity) {
        return new h(inquiryActivity.getIntent().getExtras());
    }

    private final h q() {
        return (h) this.args.getValue();
    }

    private final b0 r() {
        return (b0) this.viewModel.getValue();
    }

    private final void s(Bundle savedInstanceState) {
        if (u()) {
            Intent intent = new Intent();
            intent.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_CANCELED");
            intent.putExtra("INQUIRY_ID_KEY", q().l());
            String strS = q().s();
            intent.putExtra("SESSION_TOKEN_KEY", strS != null ? h.INSTANCE.a(strS) : null);
            h0 h0Var = h0.f84049a;
            setResult(0, intent);
            Integer numW = q().w();
            if (numW != null) {
                setTheme(numW.intValue());
            }
            dh0.d dVarC = dh0.d.c(LayoutInflater.from(this));
            p013kotlin.jvm.internal.s.j(dVarC, "inflate(...)");
            setContentView(dVarC.getRoot());
            if (savedInstanceState == null) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                p013kotlin.jvm.internal.s.j(supportFragmentManager, "getSupportFragmentManager(...)");
                r0 r0VarR = supportFragmentManager.r();
                int i11 = n2.f17309e;
                j jVar = new j();
                jVar.setArguments(getIntent().getExtras());
                r0VarR.o(i11, jVar);
                r0VarR.g();
            }
            getSupportFragmentManager().x1(q().p(), this, new n0() { // from class: bh0.k
                @Override // androidx.fragment.app.n0
                public final void a(String str, Bundle bundle) {
                    InquiryActivity.t(this.f17280a, str, bundle);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(InquiryActivity inquiryActivity, String str, Bundle bundle) {
        p013kotlin.jvm.internal.s.k(str, "<unused var>");
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        Intent intent = new Intent();
        intent.putExtras(bundle);
        h0 h0Var = h0.f84049a;
        inquiryActivity.setResult(-1, intent);
        inquiryActivity.finish();
    }

    private final boolean u() {
        String strS = q().s();
        if (strS == null || !p013kotlin.text.t.g0(strS, '\n', false, 2, null)) {
            return true;
        }
        Intent intent = new Intent();
        intent.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
        intent.putExtra("ERROR_DEBUG_MESSAGE_KEY", "Invalid session token.");
        zi0.d dVar = zi0.d.SessionTokenError;
        p013kotlin.jvm.internal.s.i(dVar, "null cannot be cast to non-null type android.os.Parcelable");
        intent.putExtra("ERROR_CODE_KEY", (Parcelable) dVar);
        h0 h0Var = h0.f84049a;
        setResult(0, intent);
        finish();
        return false;
    }

    @Override // androidx.appcompat.app.c, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context base) {
        p013kotlin.jvm.internal.s.k(base, "base");
        super.attachBaseContext(base);
        li0.a.a(this);
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws Exception {
        androidx.p002activity.q.c(this, null, null, 3, null);
        super.onCreate(savedInstanceState);
        try {
            s(savedInstanceState);
        } catch (Exception e11) {
            if (!q().b()) {
                throw e11;
            }
            if (q().e()) {
                eh0.c.c(this).c(e11);
            }
            Intent intent = new Intent();
            intent.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
            intent.putExtra("ERROR_DEBUG_MESSAGE_KEY", "A fatal exception occurred.");
            zi0.d dVar = zi0.d.ExceptionError;
            p013kotlin.jvm.internal.s.i(dVar, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("ERROR_CODE_KEY", (Parcelable) dVar);
            h0 h0Var = h0.f84049a;
            setResult(0, intent);
            finish();
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        r().z();
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (isFinishing()) {
            eh0.c.e(this);
        }
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onResume() {
        super.onResume();
        r().A();
    }
}
