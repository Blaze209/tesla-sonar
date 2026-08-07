package com.plaid.internal.link;

import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowMetrics;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r0;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.e1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import bo0.n;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.internal.ImagesContract;
import com.plaid.internal.A6;
import com.plaid.internal.AbstractActivityC4540t4;
import com.plaid.internal.AbstractC4531s4;
import com.plaid.internal.AbstractC4587y6;
import com.plaid.internal.AbstractC4590z0;
import com.plaid.internal.B2;
import com.plaid.internal.C1;
import com.plaid.internal.C3;
import com.plaid.internal.C4445i7;
import com.plaid.internal.C4449j2;
import com.plaid.internal.C4458k2;
import com.plaid.internal.C4467l2;
import com.plaid.internal.C4549u4;
import com.plaid.internal.C4594z4;
import com.plaid.internal.E3;
import com.plaid.internal.E6;
import com.plaid.internal.EnumC4419g;
import com.plaid.internal.G1;
import com.plaid.internal.G2;
import com.plaid.internal.J5;
import com.plaid.internal.K7;
import com.plaid.internal.L2;
import com.plaid.internal.S7;
import com.plaid.internal.T6;
import com.plaid.internal.U0;
import com.plaid.internal.X5;
import com.plaid.internal.Y6;
import com.plaid.internal.k8;
import com.plaid.internal.q8;
import com.plaid.internal.r8;
import com.plaid.link.Plaid;
import com.plaid.link.R;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plaid/internal/link/LinkActivity;", "Lcom/plaid/internal/t4;", "Lcom/plaid/internal/r8;", "<init>", "()V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LinkActivity extends AbstractActivityC4540t4 implements r8 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f47849e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f47850c = new e1(o0.b(C4449j2.class), new d(), new h(), new e());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e1 f47851d = new e1(o0.b(C4594z4.class), new f(), new c(), new g());

    @DebugMetadata(c = "com.plaid.internal.link.LinkActivity$onBackPressed$1", f = "LinkActivity.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47852a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return LinkActivity.this.new a(continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return LinkActivity.this.new a(continuation).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f47852a;
            if (i11 == 0) {
                t.b(obj);
                C4449j2 c4449j2 = (C4449j2) LinkActivity.this.f47850c.getValue();
                this.f47852a = 1;
                obj = c4449j2.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                LinkActivity.super.onBackPressed();
            }
            return h0.f84049a;
        }
    }

    public /* synthetic */ class b extends p013kotlin.jvm.internal.p implements l<AbstractC4590z0, h0> {
        public b(LinkActivity linkActivity) {
            super(1, linkActivity, LinkActivity.class, "navigate", "navigate(Lcom/plaid/internal/workflow/model/Destination;)V", 0);
        }

        @Override // wn0.l
        public final h0 invoke(AbstractC4590z0 abstractC4590z0) {
            AbstractC4590z0 p11 = abstractC4590z0;
            s.k(p11, "p0");
            LinkActivity linkActivity = (LinkActivity) this.receiver;
            int i11 = LinkActivity.f47849e;
            linkActivity.a(p11);
            return h0.f84049a;
        }
    }

    public static final class c extends u implements wn0.a<ViewModelProvider.Factory> {
        public c() {
            super(0);
        }

        @Override // wn0.a
        public final ViewModelProvider.Factory invoke() {
            return new C4549u4(((C4449j2) LinkActivity.this.f47850c.getValue()).f47764a);
        }
    }

    public static final class d extends u implements wn0.a<ViewModelStore> {
        public d() {
            super(0);
        }

        @Override // wn0.a
        public final ViewModelStore invoke() {
            return LinkActivity.this.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    public static final class e extends u implements wn0.a<CreationExtras> {
        public e() {
            super(0);
        }

        @Override // wn0.a
        public final CreationExtras invoke() {
            return LinkActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class f extends u implements wn0.a<ViewModelStore> {
        public f() {
            super(0);
        }

        @Override // wn0.a
        public final ViewModelStore invoke() {
            return LinkActivity.this.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    public static final class g extends u implements wn0.a<CreationExtras> {
        public g() {
            super(0);
        }

        @Override // wn0.a
        public final CreationExtras invoke() {
            return LinkActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class h extends u implements wn0.a<ViewModelProvider.Factory> {
        public h() {
            super(0);
        }

        @Override // wn0.a
        public final ViewModelProvider.Factory invoke() {
            LinkActivity linkActivity = LinkActivity.this;
            linkActivity.getClass();
            Plaid plaid = Plaid.INSTANCE;
            Application application = linkActivity.getApplication();
            s.j(application, "getApplication(...)");
            return new C4467l2(plaid.provideLinkTokenComponent$link_sdk_release(application));
        }
    }

    public static final void c(LinkActivity linkActivity) {
        linkActivity.f48140b = true;
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, android.app.Activity
    @jn0.e
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 3365) {
            if (i12 != -1 || intent == null) {
                X5.f46812a.getClass();
                X5.a.a("User denied SMS permission", true);
            } else {
                String stringExtra = intent.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE);
                Intent intent2 = new Intent("link_share_sms_from_consent_result_action");
                intent2.putExtra("link_shared_sms_content_extra", stringExtra);
                sendBroadcast(intent2);
            }
        }
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        BuildersKt__Builders_commonKt.launch$default(d1.a((C4449j2) this.f47850c.getValue()), null, null, new a(null), 3, null);
    }

    @Override // com.plaid.internal.AbstractActivityC4540t4, androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws B2 {
        X5.f46812a.getClass();
        X5.a.a("OnCreate", true);
        A6.a.b(v0.i(), "LinkActivity onCreate");
        C4445i7.a(this);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        setContentView(R.layout.plaid_activity_link);
        C4449j2 c4449j2 = (C4449j2) this.f47850c.getValue();
        b observer = new b(this);
        c4449j2.getClass();
        s.k(this, "lifecycleOwner");
        s.k(observer, "observer");
        G2 g11 = c4449j2.f47765b;
        if (g11 == null) {
            s.B("navigator");
            g11 = null;
        }
        g11.f46322a.observe(this, new C4449j2.a(observer));
        C4449j2 c4449j3 = (C4449j2) this.f47850c.getValue();
        if (c4449j3.f47769f == null) {
            c4449j3.f47769f = BuildersKt__Builders_commonKt.launch$default(d1.a(c4449j3), Dispatchers.getDefault(), null, new C4458k2(c4449j3, null), 2, null);
        }
        super.onCreate(bundle);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        A6.a.b(v0.i(), "LinkActivity onDestroy");
        super.onDestroy();
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        X5.f46812a.getClass();
        X5.a.a("OnPause", true);
        A6.a.b(v0.i(), "LinkActivity onPause");
        super.onPause();
    }

    @Override // com.plaid.internal.AbstractActivityC4540t4, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        X5.f46812a.getClass();
        X5.a.a("OnResume", true);
        A6.a.b(v0.i(), "LinkActivity onResume");
        super.onResume();
    }

    public static final C4594z4 a(LinkActivity linkActivity) {
        return (C4594z4) linkActivity.f47851d.getValue();
    }

    @Override // com.plaid.internal.r8
    public final E3 b() {
        return new E3(((C4449j2) this.f47850c.getValue()).f47764a);
    }

    public final void c() {
        startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + ((String) null))));
    }

    @Override // com.plaid.internal.AbstractActivityC4540t4
    public final void a(Intent intent) {
        AbstractC4587y6 abstractC4587y6A = intent != null ? C1.a(intent) : null;
        if (abstractC4587y6A != null) {
            X5.a.a(X5.f46812a, "onIntentReady with redirectState: " + abstractC4587y6A);
            A6.a.b(v0.i(), "LinkActivity onIntentReady with redirectState: " + abstractC4587y6A);
        }
        ((C4449j2) this.f47850c.getValue()).a(abstractC4587y6A);
    }

    public final void a(AbstractC4590z0 abstractC4590z0) {
        X5.a.a(X5.f46812a, "Navigating to " + abstractC4590z0);
        try {
            if (s.f(abstractC4590z0, AbstractC4590z0.e.f48255a)) {
                C3 fragment = new C3();
                s.k(fragment, "fragment");
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                s.j(supportFragmentManager, "getSupportFragmentManager(...)");
                r0 r0VarR = supportFragmentManager.r();
                r0VarR.o(R.id.fragment_container, fragment);
                r0VarR.h();
                return;
            }
            if (abstractC4590z0 instanceof AbstractC4590z0.i) {
                Fragment fragment2 = (Fragment) ((AbstractC4590z0.i.a.C0761a) ((AbstractC4590z0.i) abstractC4590z0).a()).invoke(((AbstractC4590z0.i) abstractC4590z0).b());
                s.k(fragment2, "fragment");
                FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                s.j(supportFragmentManager2, "getSupportFragmentManager(...)");
                r0 r0VarR2 = supportFragmentManager2.r();
                r0VarR2.o(R.id.fragment_container, fragment2);
                r0VarR2.h();
                return;
            }
            if (abstractC4590z0 instanceof AbstractC4590z0.j) {
                Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(this, 96171, ((AbstractC4590z0.j) abstractC4590z0).a());
                return;
            }
            if (abstractC4590z0 instanceof AbstractC4590z0.d) {
                Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(this, 6148, ((AbstractC4590z0.d) abstractC4590z0).a());
                return;
            }
            if (abstractC4590z0 instanceof AbstractC4590z0.f) {
                String strA = ((AbstractC4590z0.f) abstractC4590z0).a();
                Map metadata = v0.f(x.a(ImagesContract.URL, strA));
                s.k("Opening url in default browser", "eventName");
                s.k(metadata, "metadata");
                A6.a.a("Opening url in default browser", metadata, E6.INFO);
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strA)));
                return;
            }
            if (abstractC4590z0 instanceof AbstractC4590z0.g) {
                a(((AbstractC4590z0.g) abstractC4590z0).a());
                return;
            }
            if (abstractC4590z0 instanceof AbstractC4590z0.a) {
                c();
                return;
            }
            if (abstractC4590z0 instanceof AbstractC4590z0.k) {
                Y6 smsAutofillType = ((AbstractC4590z0.k) abstractC4590z0).a();
                int i11 = K7.f46388l;
                s.k(smsAutofillType, "smsAutofillType");
                K7 fragment3 = new K7();
                Bundle bundle = new Bundle();
                bundle.putSerializable("smsAutofillType", smsAutofillType);
                fragment3.setArguments(bundle);
                s.k(fragment3, "fragment");
                FragmentManager supportFragmentManager3 = getSupportFragmentManager();
                s.j(supportFragmentManager3, "getSupportFragmentManager(...)");
                r0 r0VarR3 = supportFragmentManager3.r();
                r0VarR3.o(R.id.fragment_container, fragment3);
                r0VarR3.h();
                return;
            }
            if (abstractC4590z0 instanceof AbstractC4590z0.h) {
                BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(this), null, null, new G1(this, null), 3, null);
                return;
            }
            if (abstractC4590z0 instanceof AbstractC4590z0.b) {
                ((C4594z4) this.f47851d.getValue()).a(((AbstractC4590z0.b) abstractC4590z0).a());
                return;
            }
            if (abstractC4590z0 instanceof AbstractC4590z0.c) {
                int i12 = U0.f46726c;
                U0 fragment4 = U0.a.a(((AbstractC4590z0.c) abstractC4590z0).a());
                s.k(fragment4, "fragment");
                FragmentManager supportFragmentManager4 = getSupportFragmentManager();
                s.j(supportFragmentManager4, "getSupportFragmentManager(...)");
                r0 r0VarR4 = supportFragmentManager4.r();
                r0VarR4.o(R.id.fragment_container, fragment4);
                r0VarR4.h();
            }
        } catch (Exception e11) {
            X5.a.b(X5.f46812a, e11, "Error occurred while trying to render: " + abstractC4590z0);
            Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(this, 6148, L2.b(e11, null));
        }
    }

    public final void a(AbstractC4531s4 abstractC4531s4) {
        int iJ;
        A6.a.b(v0.i(), "Opening URL within webview session");
        if (abstractC4531s4 instanceof AbstractC4531s4.d) {
            String str = abstractC4531s4.f48107a;
            int i11 = ((AbstractC4531s4.d) abstractC4531s4).f48108b;
            PackageManager packageManager = getPackageManager();
            s.j(packageManager, "getPackageManager(...)");
            s.k(packageManager, "packageManager");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            s.j(listQueryIntentServices, "queryIntentServices(...)");
            if (listQueryIntentServices.isEmpty()) {
                s.k("Can't open custom tab -- custom tabs are not supported on this device", "message");
                X5.a.b(X5.f46812a, "Can't open custom tab -- custom tabs are not supported on this device");
                J5 j11 = T6.f46721a;
                if (j11 != null) {
                    j11.a("Can't open custom tab -- custom tabs are not supported on this device");
                    return;
                }
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics maximumWindowMetrics = getWindowManager().getMaximumWindowMetrics();
                s.j(maximumWindowMetrics, "getMaximumWindowMetrics(...)");
                iJ = maximumWindowMetrics.getBounds().height();
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                iJ = displayMetrics.heightPixels;
            }
            if (i11 != 0) {
                iJ = n.j(iJ, i11);
            }
            Map metadata = v0.f(x.a(ImagesContract.URL, str));
            s.k("Opening custom tab with url", "eventName");
            s.k(metadata, "metadata");
            A6.a.a("Opening custom tab with url", metadata, E6.INFO);
            androidx.browser.customtabs.d dVarB = new androidx.browser.customtabs.d.C0067d().g(iJ, 2).b();
            s.j(dVarB, "build(...)");
            Intent intent = dVarB.f2960a;
            s.j(intent, "intent");
            intent.addFlags(1073741824);
            intent.setData(Uri.parse(str));
            startActivityForResult(intent, 0);
            return;
        }
        if (abstractC4531s4 instanceof AbstractC4531s4.c) {
            a(abstractC4531s4.f48107a);
            return;
        }
        if (abstractC4531s4 instanceof AbstractC4531s4.b) {
            String str2 = abstractC4531s4.f48107a;
            Map metadata2 = v0.f(x.a(ImagesContract.URL, str2));
            s.k("Opening url in default browser", "eventName");
            s.k(metadata2, "metadata");
            A6.a.a("Opening url in default browser", metadata2, E6.INFO);
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
        }
    }

    public final void a(String str) {
        PackageManager packageManager = getPackageManager();
        s.j(packageManager, "getPackageManager(...)");
        s.k(packageManager, "packageManager");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        s.j(listQueryIntentServices, "queryIntentServices(...)");
        if (listQueryIntentServices.isEmpty()) {
            s.k("Can't open custom tab -- custom tabs are not supported on this device", "message");
            X5.a.b(X5.f46812a, "Can't open custom tab -- custom tabs are not supported on this device");
            J5 j11 = T6.f46721a;
            if (j11 != null) {
                j11.a("Can't open custom tab -- custom tabs are not supported on this device");
                return;
            }
            return;
        }
        Map metadata = v0.f(x.a(ImagesContract.URL, str));
        s.k("Opening custom tab with url", "eventName");
        s.k(metadata, "metadata");
        A6.a.a("Opening custom tab with url", metadata, E6.INFO);
        androidx.browser.customtabs.d dVarB = new androidx.browser.customtabs.d.C0067d().b();
        s.j(dVarB, "build(...)");
        dVarB.a(this, Uri.parse(str));
    }

    @Override // com.plaid.internal.r8
    public final q8 a(k8.a createWorkflowViewModel) {
        s.k(createWorkflowViewModel, "createWorkflowViewModel");
        return new q8(createWorkflowViewModel, ((C4449j2) this.f47850c.getValue()).f47764a);
    }

    @Override // com.plaid.internal.r8
    public final S7 a() {
        return new S7(((C4449j2) this.f47850c.getValue()).f47764a);
    }
}
