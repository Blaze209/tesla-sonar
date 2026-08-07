package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0017¨\u0006("}, d2 = {"Lcom/stripe/android/stripe3ds2/views/q;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "html", "e", "(Ljava/lang/String;)Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "f", "Ljn0/h0;", "c", "(Ljava/lang/String;)V", "Landroid/view/View$OnClickListener;", "onClickListener", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;", "a", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;", "getWebView", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;", "webView", "<set-?>", "b", "Ljava/lang/String;", "getUserEntry", "()Ljava/lang/String;", "userEntry", "Landroid/view/View$OnClickListener;", "getOnClickListener$3ds2sdk_release", "()Landroid/view/View$OnClickListener;", "setOnClickListener$3ds2sdk_release", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class q extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f54320d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f54321e = Pattern.compile("method=\"post\"", 10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f54322f = Pattern.compile("action=\"(.+?)\"", 10);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ThreeDS2WebView webView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String userEntry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private View.OnClickListener onClickListener;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001c\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/q$a;", "", "<init>", "()V", "", "ENCODING", "Ljava/lang/String;", "HTML_MIME_TYPE", "METHOD_GET", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PATTERN_FORM_ACTION", "Ljava/util/regex/Pattern;", "PATTERN_METHOD_POST", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(q this$0, String str) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (str == null) {
            str = "";
        }
        this$0.userEntry = str;
        View.OnClickListener onClickListener = this$0.onClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this$0);
        }
    }

    private final String d(String html) {
        String strGroup;
        Matcher matcher = f54322f.matcher(html);
        return (!matcher.find() || (strGroup = matcher.group(1)) == null || p013kotlin.jvm.internal.s.f("https://emv3ds/challenge", strGroup)) ? html : new p013kotlin.text.q(strGroup).j(html, "https://emv3ds/challenge");
    }

    private final String e(String html) {
        String strReplaceAll = f54321e.matcher(html).replaceAll("method=\"get\"");
        p013kotlin.jvm.internal.s.j(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final void c(String html) {
        if (html == null) {
            return;
        }
        this.webView.loadDataWithBaseURL(null, f(html), "text/html", "UTF-8", null);
    }

    public final String f(String html) {
        p013kotlin.jvm.internal.s.k(html, "html");
        return d(e(html));
    }

    /* JADX INFO: renamed from: getOnClickListener$3ds2sdk_release, reason: from getter */
    public final View.OnClickListener getOnClickListener() {
        return this.onClickListener;
    }

    public String getUserEntry() {
        return this.userEntry;
    }

    public final ThreeDS2WebView getWebView() {
        return this.webView;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public final void setOnClickListener$3ds2sdk_release(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ q(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.userEntry = "";
        o80.i iVarB = o80.i.b(LayoutInflater.from(context), this);
        p013kotlin.jvm.internal.s.j(iVarB, "inflate(...)");
        ThreeDS2WebView webView = iVarB.f96874b;
        p013kotlin.jvm.internal.s.j(webView, "webView");
        this.webView = webView;
        webView.setOnHtmlSubmitListener$3ds2sdk_release(new x.b() { // from class: com.stripe.android.stripe3ds2.views.p
            @Override // com.stripe.android.stripe3ds2.views.x.b
            public final void a(String str) {
                q.b(this.f54319a, str);
            }
        });
    }
}
