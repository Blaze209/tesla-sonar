package io.sentry;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes9.dex */
public final class w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f81571a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f81572b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f81573c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f81574d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f81575e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f81576f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f81577g = "Report a Bug";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CharSequence f81578h = "Send Bug Report";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f81579i = "Cancel";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f81580j = "Name";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f81581k = "Your Name";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CharSequence f81582l = "Email";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CharSequence f81583m = "your.email@example.org";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f81584n = " (Required)";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f81585o = "Description";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f81586p = "What's the bug? What did you expect?";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f81587q = "Thank you for your report!";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f81588r;

    public interface a {
    }

    public interface b {
    }

    public w6(a aVar) {
        this.f81588r = aVar;
    }

    public boolean a() {
        return this.f81573c;
    }

    public boolean b() {
        return this.f81571a;
    }

    public boolean c() {
        return this.f81576f;
    }

    public boolean d() {
        return this.f81574d;
    }

    public boolean e() {
        return this.f81572b;
    }

    public boolean f() {
        return this.f81575e;
    }

    public void g(a aVar) {
        this.f81588r = aVar;
    }

    public void h(boolean z11) {
        this.f81573c = z11;
    }

    public void i(boolean z11) {
        this.f81571a = z11;
    }

    public void j(boolean z11) {
        this.f81576f = z11;
    }

    public void k(boolean z11) {
        this.f81574d = z11;
    }

    public void l(boolean z11) {
        this.f81572b = z11;
    }

    public void m(boolean z11) {
        this.f81575e = z11;
    }

    public String toString() {
        return "SentryFeedbackOptions{isNameRequired=" + this.f81571a + ", showName=" + this.f81572b + ", isEmailRequired=" + this.f81573c + ", showEmail=" + this.f81574d + ", useSentryUser=" + this.f81575e + ", showBranding=" + this.f81576f + ", formTitle='" + ((Object) this.f81577g) + CoreConstants.SINGLE_QUOTE_CHAR + ", submitButtonLabel='" + ((Object) this.f81578h) + CoreConstants.SINGLE_QUOTE_CHAR + ", cancelButtonLabel='" + ((Object) this.f81579i) + CoreConstants.SINGLE_QUOTE_CHAR + ", nameLabel='" + ((Object) this.f81580j) + CoreConstants.SINGLE_QUOTE_CHAR + ", namePlaceholder='" + ((Object) this.f81581k) + CoreConstants.SINGLE_QUOTE_CHAR + ", emailLabel='" + ((Object) this.f81582l) + CoreConstants.SINGLE_QUOTE_CHAR + ", emailPlaceholder='" + ((Object) this.f81583m) + CoreConstants.SINGLE_QUOTE_CHAR + ", isRequiredLabel='" + ((Object) this.f81584n) + CoreConstants.SINGLE_QUOTE_CHAR + ", messageLabel='" + ((Object) this.f81585o) + CoreConstants.SINGLE_QUOTE_CHAR + ", messagePlaceholder='" + ((Object) this.f81586p) + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }
}
