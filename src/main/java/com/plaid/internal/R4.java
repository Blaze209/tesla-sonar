package com.plaid.internal;

import android.net.Uri;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.p002activity.result.ActivityResultLauncher;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class R4 extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityResultLauncher<String> f46656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityResultLauncher<jn0.h0> f46657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P7 f46658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K7 f46659d;

    public static final class a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PermissionRequest f46660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String[] f46661b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PermissionRequest permissionRequest, String[] strArr) {
            super(0);
            this.f46660a = permissionRequest;
            this.f46661b = strArr;
        }

        @Override // wn0.a
        public final jn0.h0 invoke() {
            this.f46660a.grant(this.f46661b);
            return jn0.h0.f84049a;
        }
    }

    public static final class b extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PermissionRequest f46662a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PermissionRequest permissionRequest) {
            super(0);
            this.f46662a = permissionRequest;
        }

        @Override // wn0.a
        public final jn0.h0 invoke() {
            this.f46662a.deny();
            return jn0.h0.f84049a;
        }
    }

    public static final class c extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {
        public c() {
            super(0);
        }

        @Override // wn0.a
        public final jn0.h0 invoke() {
            ActivityResultLauncher<jn0.h0> activityResultLauncher = R4.this.f46657b;
            jn0.h0 h0Var = jn0.h0.f84049a;
            activityResultLauncher.b(h0Var);
            return h0Var;
        }
    }

    public R4(ActivityResultLauncher inputFileResultContract, ActivityResultLauncher takePictureContract, P7 listener, K7 permissionHelper) {
        p013kotlin.jvm.internal.s.k(inputFileResultContract, "inputFileResultContract");
        p013kotlin.jvm.internal.s.k(takePictureContract, "takePictureContract");
        p013kotlin.jvm.internal.s.k(listener, "listener");
        p013kotlin.jvm.internal.s.k(permissionHelper, "permissionHelper");
        this.f46656a = inputFileResultContract;
        this.f46657b = takePictureContract;
        this.f46658c = listener;
        this.f46659d = permissionHelper;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (permissionRequest == null) {
            return;
        }
        String[] resources = permissionRequest.getResources();
        p013kotlin.jvm.internal.s.j(resources, "getResources(...)");
        if (p013kotlin.collections.n.e0(resources, "android.webkit.resource.VIDEO_CAPTURE")) {
            String[] strArr = (String[]) p013kotlin.collections.v.e("android.webkit.resource.VIDEO_CAPTURE").toArray(new String[0]);
            if (this.f46659d.a()) {
                permissionRequest.grant(strArr);
            } else {
                this.f46659d.a(new a(permissionRequest, strArr), new b(permissionRequest));
            }
        }
        String[] resources2 = permissionRequest.getResources();
        p013kotlin.jvm.internal.s.j(resources2, "getResources(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : resources2) {
            if (!p013kotlin.jvm.internal.s.f(str, "android.webkit.resource.VIDEO_CAPTURE")) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            T6.a.a("WebView requesting unsupported permission - " + ((String) it.next()));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView view, int i11) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (i11 == 100) {
            i11 = 0;
        }
        super.onProgressChanged(view, i11);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String[] acceptTypes;
        if (valueCallback == null) {
            return false;
        }
        this.f46658c.f46605n = valueCallback;
        if (fileChooserParams == null || !fileChooserParams.isCaptureEnabled() || (acceptTypes = fileChooserParams.getAcceptTypes()) == null || !p013kotlin.collections.n.e0(acceptTypes, ClipboardModule.MIMETYPE_JPEG)) {
            this.f46656a.b("*/*");
            return true;
        }
        if (webView == null) {
            return false;
        }
        if (this.f46659d.a()) {
            this.f46657b.b(jn0.h0.f84049a);
        } else {
            K7 k11 = this.f46659d;
            c success = new c();
            M4 failure = M4.f46459a;
            k11.getClass();
            p013kotlin.jvm.internal.s.k(success, "success");
            p013kotlin.jvm.internal.s.k(failure, "failure");
            k11.f46394f = success;
            k11.f46395g = failure;
            k11.f46396h.b("android.permission.CAMERA");
        }
        return true;
    }
}
