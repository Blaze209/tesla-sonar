package com.tesla.share;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o;
import androidx.fragment.app.u;
import bo0.n;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.iid.InstanceID;
import java.io.Serializable;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import q5.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 52\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u0003R\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/tesla/share/a;", "Landroidx/fragment/app/o;", "<init>", "()V", "Lcom/tesla/share/a$a$a;", "dialogType", "", "msg", "", "dismissTimeoutSeconds", "Ljn0/h0;", "m", "(Lcom/tesla/share/a$a$a;Ljava/lang/String;I)V", "type", "p", "(Lcom/tesla/share/a$a$a;)V", "k", "j", "resId", "l", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "Lge0/a;", "Lge0/a;", "_binding", "n", "Ljava/lang/String;", "message", "o", "Lcom/tesla/share/a$a$a;", "I", "Ljava/lang/Runnable;", "q", "Ljava/lang/Runnable;", "closeDialogRunnable", "Landroid/os/Handler;", "r", "Landroid/os/Handler;", "handler", IntegerTokenConverter.CONVERTER_KEY, "()Lge0/a;", "binding", "s", "a", "share_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends o {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private ge0.a _binding;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String message;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int dismissTimeoutSeconds;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Runnable closeDialogRunnable;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Companion.EnumC1145a dialogType = Companion.EnumC1145a.ALERT;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.tesla.share.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/tesla/share/a$a;", "", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lcom/tesla/share/a$a$a;", "dialogType", "", "message", "", "dismissTimeoutSeconds", "Ljn0/h0;", "a", "(Landroidx/fragment/app/FragmentManager;Lcom/tesla/share/a$a$a;Ljava/lang/String;I)V", "TAG", "Ljava/lang/String;", "DIALOG_TYPE", "MESSAGE", "TIMEOUT_SECONDS", "MIN_TIMEOUT_SECONDS", "I", "share_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.tesla.share.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tesla/share/a$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "ALERT", "ERROR", "SUCCESS", "PROCESSING", InstanceID.ERROR_TIMEOUT, "share_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public enum EnumC1145a {
            ALERT,
            ERROR,
            SUCCESS,
            PROCESSING,
            TIMEOUT;

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            public static EnumEntries<EnumC1145a> getEntries() {
                return $ENTRIES;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(FragmentManager fragmentManager, EnumC1145a dialogType, String message, int dismissTimeoutSeconds) {
            s.k(fragmentManager, "fragmentManager");
            s.k(dialogType, "dialogType");
            s.k(message, "message");
            Fragment fragmentO0 = fragmentManager.o0("share_dialog_fragment");
            if (fragmentO0 != null && fragmentO0.isResumed()) {
                ((a) fragmentO0).m(dialogType, message, dismissTimeoutSeconds);
                return;
            }
            a aVar = new a();
            aVar.setArguments(d.b(x.a("type", dialogType), x.a("msg", message), x.a("timeout_seconds", Integer.valueOf(dismissTimeoutSeconds))));
            fragmentManager.r().e(aVar, "share_dialog_fragment").j();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56569a;

        static {
            int[] iArr = new int[Companion.EnumC1145a.values().length];
            try {
                iArr[Companion.EnumC1145a.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Companion.EnumC1145a.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Companion.EnumC1145a.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Companion.EnumC1145a.PROCESSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Companion.EnumC1145a.TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f56569a = iArr;
        }
    }

    private final ge0.a i() {
        ge0.a aVar = this._binding;
        s.h(aVar);
        return aVar;
    }

    private final void j() {
        i().f68789d.setVisibility(8);
    }

    private final void k() {
        l(fe0.a.f65784a);
    }

    private final void l(int resId) {
        ImageView imageView = i().f68788c;
        imageView.setImageResource(resId);
        imageView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Companion.EnumC1145a dialogType, String msg, int dismissTimeoutSeconds) {
        p(dialogType);
        TextView textView = i().f68787b;
        textView.setText(msg);
        textView.setVisibility((msg == null || t.y0(msg)) ? 8 : 0);
        Runnable runnable = this.closeDialogRunnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: fe0.g
            @Override // java.lang.Runnable
            public final void run() {
                com.tesla.share.a.n(this.f65797a);
            }
        };
        this.handler.postDelayed(runnable2, n.f(dismissTimeoutSeconds, 1) * 1000);
        this.closeDialogRunnable = runnable2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(a aVar) {
        if (!aVar.isResumed() || aVar.isRemoving()) {
            return;
        }
        aVar.dismiss();
        u activity = aVar.getActivity();
        if (activity != null) {
            activity.finishAndRemoveTask();
        }
        aVar.closeDialogRunnable = null;
    }

    private final void p(Companion.EnumC1145a type) {
        int i11 = b.f56569a[type.ordinal()];
        if (i11 == 1) {
            k();
            j();
            i().f68790e.setText(bc0.a.P0);
            return;
        }
        if (i11 == 2) {
            k();
            j();
            i().f68790e.setText(bc0.a.O0);
            return;
        }
        if (i11 == 3) {
            l(fe0.a.f65785b);
            j();
            i().f68790e.setText(bc0.a.R0);
        } else if (i11 == 4) {
            i().f68789d.setVisibility(0);
            i().f68788c.setVisibility(8);
            i().f68790e.setText(bc0.a.Q0);
        } else {
            if (i11 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            k();
            j();
            i().f68790e.setText(bc0.a.O0);
        }
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, fe0.d.f65791a);
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalStateException("Arguments missing");
        }
        Serializable serializable = arguments.getSerializable("type");
        s.i(serializable, "null cannot be cast to non-null type com.tesla.share.ShareDialogFragment.Companion.DialogType");
        this.dialogType = (Companion.EnumC1145a) serializable;
        this.message = arguments.getString("msg");
        this.dismissTimeoutSeconds = arguments.getInt("timeout_seconds");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        s.k(inflater, "inflater");
        this._binding = ge0.a.c(inflater, container, false);
        m(this.dialogType, this.message, this.dismissTimeoutSeconds);
        FrameLayout root = i().getRoot();
        s.j(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Runnable runnable = this.closeDialogRunnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
        }
        this._binding = null;
        u activity = getActivity();
        if (activity != null) {
            activity.finishAffinity();
        }
    }
}
