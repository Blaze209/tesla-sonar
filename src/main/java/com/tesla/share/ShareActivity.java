package com.tesla.share;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.iid.InstanceID;
import com.tesla.oapi.OwnerAPIError;
import com.tesla.oapi.OwnerAPIRequestCallback;
import com.tesla.share.ShareActivity;
import fe0.f;
import fe0.h;
import fe0.k;
import jn0.m;
import org.json.JSONObject;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/tesla/share/ShareActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Lfe0/f;", "content", "Ljn0/h0;", "u", "(Lfe0/f;)V", "", "t", "()Z", "r", "()Lfe0/f;", "Lcom/tesla/share/a$a$a;", "type", "", "msg", "", "timeoutSeconds", "v", "(Lcom/tesla/share/a$a$a;Ljava/lang/String;I)V", "Lcom/tesla/share/ShareActivity$b;", "result", "message", "x", "(Lcom/tesla/share/ShareActivity$b;Ljava/lang/String;)V", "messageResId", "w", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lfe0/k;", "f", "Lkotlin/Lazy;", "s", "()Lfe0/k;", "vehicleClient", "g", "b", "a", "share_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShareActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy vehicleClient = m.b(new wn0.a() { // from class: fe0.e
        @Override // wn0.a
        public final Object invoke() {
            return ShareActivity.y(this.f65792a);
        }
    });

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/share/ShareActivity$b;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", InstanceID.ERROR_TIMEOUT, "share_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private enum b {
        SUCCESS,
        ERROR,
        TIMEOUT;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56560a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f56560a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/tesla/share/ShareActivity$d", "Lcom/tesla/oapi/OwnerAPIRequestCallback;", "Lorg/json/JSONObject;", "response", "Ljn0/h0;", "onCompletion", "(Lorg/json/JSONObject;)V", "Lcom/tesla/oapi/OwnerAPIError;", "errorType", "onFailure", "(Lcom/tesla/oapi/OwnerAPIError;)V", "onTimeout", "()V", "share_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements OwnerAPIRequestCallback {
        d() {
        }

        @Override // com.tesla.oapi.OwnerAPIRequestCallback
        public void onCompletion(JSONObject response) {
            h.f65798a.a("Successful share");
            ShareActivity shareActivity = ShareActivity.this;
            b bVar = b.SUCCESS;
            String string = shareActivity.getString(bc0.a.T0);
            s.j(string, "getString(...)");
            String strD = ShareActivity.this.s().d();
            if (strD == null) {
                strD = "";
            }
            shareActivity.x(bVar, t.V(string, "%vehicleName%", strD, false, 4, null));
        }

        @Override // com.tesla.oapi.OwnerAPIRequestCallback
        public void onFailure(OwnerAPIError errorType) {
            h.f65798a.a("onFailure " + errorType);
            int i11 = bc0.a.S0;
            if (errorType == OwnerAPIError.OWNERAPI_ERROR_MOBILE_ACCESS_DISABLED) {
                i11 = bc0.a.L0;
                ShareActivity.this.s().j();
            }
            ShareActivity.this.w(i11);
        }

        @Override // com.tesla.oapi.OwnerAPIRequestCallback
        public void onTimeout() {
            h.f65798a.a("Timeout reached");
            ShareActivity shareActivity = ShareActivity.this;
            b bVar = b.TIMEOUT;
            String string = shareActivity.getString(bc0.a.U0);
            s.j(string, "getString(...)");
            shareActivity.x(bVar, string);
        }
    }

    private final f r() {
        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();
        String strP = he0.b.m(getApplicationContext()).p();
        s.j(strP, "getLocale(...)");
        f fVar = new f("share_ext_content_raw", strP);
        s.h(intent);
        fVar.b(intent);
        if (s.f("android.intent.action.SEND", action) && type != null) {
            fVar.e(intent);
            if (s.f(type, "text/x-vcard")) {
                fVar.a(getApplicationContext(), intent);
            }
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k s() {
        return (k) this.vehicleClient.getValue();
    }

    private final boolean t() {
        if (s().g()) {
            w(bc0.a.K0);
            return false;
        }
        if (!s().h()) {
            w(bc0.a.N0);
            return false;
        }
        if (s().i()) {
            return true;
        }
        w(bc0.a.M0);
        return false;
    }

    private final void u(f content) {
        d dVar = new d();
        JSONObject jSONObjectG = content.g();
        if (jSONObjectG == null) {
            throw new IllegalStateException("Invalid share content JSON!");
        }
        if (s().k(jSONObjectG, dVar, 10L)) {
            return;
        }
        w(bc0.a.J0);
    }

    private final void v(a.Companion.EnumC1145a type, String msg, int timeoutSeconds) {
        if (isFinishing()) {
            return;
        }
        a.Companion companion = a.INSTANCE;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        s.j(supportFragmentManager, "getSupportFragmentManager(...)");
        companion.a(supportFragmentManager, type, msg, timeoutSeconds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(int messageResId) {
        b bVar = b.ERROR;
        String string = getString(messageResId);
        s.j(string, "getString(...)");
        x(bVar, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(b result, String message) {
        int i11 = c.f56560a[result.ordinal()];
        if (i11 == 1) {
            v(a.Companion.EnumC1145a.TIMEOUT, message, 3);
        } else if (i11 == 2) {
            v(a.Companion.EnumC1145a.SUCCESS, message, 3);
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            v(a.Companion.EnumC1145a.ERROR, message, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k y(ShareActivity shareActivity) {
        Context applicationContext = shareActivity.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        return new k(applicationContext);
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        v(a.Companion.EnumC1145a.PROCESSING, "", 10);
        f fVarR = r();
        if (t()) {
            if (fVarR.f()) {
                u(fVarR);
            } else {
                w(bc0.a.J0);
            }
        }
    }
}
