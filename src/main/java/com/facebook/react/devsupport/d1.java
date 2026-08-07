package com.facebook.react.devsupport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.method.LinkMovementMethod;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.util.concurrent.Executor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002#!B#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\rJ5\u0010\u001e\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000b¢\u0006\u0004\b \u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lcom/facebook/react/devsupport/d1;", "Landroid/widget/LinearLayout;", "Landroid/widget/AdapterView$OnItemClickListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpn/e;", "devSupportManager", "Lpn/j;", "redBoxHandler", "<init>", "(Landroid/content/Context;Lpn/e;Lpn/j;)V", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "()V", "", "title", "", "Lpn/k;", "stack", "setExceptionDetails", "(Ljava/lang/String;[Lpn/k;)V", IntegerTokenConverter.CONVERTER_KEY, "Landroid/widget/AdapterView;", "parent", "Landroid/view/View;", "view", "", "position", "", "id", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "g", "a", "Lpn/e;", "b", "Lpn/j;", "Landroid/widget/ListView;", "c", "Landroid/widget/ListView;", "stackView", "Landroid/widget/Button;", "Landroid/widget/Button;", "reportButton", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "reportTextView", "Landroid/widget/ProgressBar;", "f", "Landroid/widget/ProgressBar;", "loadingIndicator", "Landroid/view/View;", "lineSeparator", "", "h", "Z", "isReporting", "Lpn/j$a;", "Lpn/j$a;", "reportCompletedListener", "Landroid/view/View$OnClickListener;", "j", "Landroid/view/View$OnClickListener;", "reportButtonOnClickListener", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class d1 extends LinearLayout implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pn.e devSupportManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pn.j redBoxHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ListView stackView;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Button reportButton;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private TextView reportTextView;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private ProgressBar loadingIndicator;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private View lineSeparator;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isReporting;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final pn.j.a reportCompletedListener;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final View.OnClickListener reportButtonOnClickListener;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0002\u0018\u0000 \r2\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\n\u001a\u0004\u0018\u00010\u00032\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\b\"\u0004\u0018\u00010\u0002H\u0015¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/devsupport/d1$a;", "Landroid/os/AsyncTask;", "Lpn/k;", "Ljava/lang/Void;", "Lpn/e;", "devSupportManager", "<init>", "(Lpn/e;)V", "", "stackFrames", "a", "([Lpn/k;)Ljava/lang/Void;", "Lpn/e;", "b", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a extends AsyncTask<pn.k, Void, Void> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final MediaType f22458c = MediaType.INSTANCE.m686deprecated_parse("application/json; charset=utf-8");

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final pn.e devSupportManager;

        /* JADX INFO: renamed from: com.facebook.react.devsupport.d1$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/react/devsupport/d1$a$a;", "", "<init>", "()V", "Lpn/k;", "frame", "Lorg/json/JSONObject;", "b", "(Lpn/k;)Lorg/json/JSONObject;", "Lokhttp3/MediaType;", "JSON", "Lokhttp3/MediaType;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final JSONObject b(pn.k frame) {
                return new JSONObject(p013kotlin.collections.v0.m(jn0.x.a(Action.FILE_ATTRIBUTE, frame.getFile()), jn0.x.a("methodName", frame.getMethod()), jn0.x.a("lineNumber", Integer.valueOf(frame.a())), jn0.x.a("column", Integer.valueOf(frame.getColumn()))));
            }

            private Companion() {
            }
        }

        public a(pn.e devSupportManager) {
            p013kotlin.jvm.internal.s.k(devSupportManager, "devSupportManager");
            this.devSupportManager = devSupportManager;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        @jn0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(pn.k... stackFrames) {
            p013kotlin.jvm.internal.s.k(stackFrames, "stackFrames");
            try {
                String string = Uri.parse(this.devSupportManager.y()).buildUpon().path("/open-stack-frame").query(null).build().toString();
                p013kotlin.jvm.internal.s.j(string, "toString(...)");
                OkHttpClient okHttpClient = new OkHttpClient();
                for (pn.k kVar : stackFrames) {
                    Companion companion = INSTANCE;
                    if (kVar == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String string2 = companion.b(kVar).toString();
                    p013kotlin.jvm.internal.s.j(string2, "toString(...)");
                    FirebasePerfOkHttpClient.execute(okHttpClient.newCall(new Request.Builder().url(string).post(RequestBody.INSTANCE.create(f22458c, string2)).build()));
                }
            } catch (Exception e11) {
                qk.a.n("ReactNative", "Could not open stack frame", e11);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 %2\u00020\u0001:\u0002#!B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/facebook/react/devsupport/d1$b;", "Landroid/widget/BaseAdapter;", "", "title", "", "Lpn/k;", "stack", "<init>", "(Ljava/lang/String;[Lpn/k;)V", "", "areAllItemsEnabled", "()Z", "", "position", "isEnabled", "(I)Z", "getCount", "()I", "", "getItem", "(I)Ljava/lang/Object;", "", "getItemId", "(I)J", "getViewTypeCount", "getItemViewType", "(I)I", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "a", "Ljava/lang/String;", "b", "[Lpn/k;", "c", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class b extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final pn.k[] stack;

        /* JADX INFO: renamed from: com.facebook.react.devsupport.d1$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\r"}, d2 = {"Lcom/facebook/react/devsupport/d1$b$b;", "", "Landroid/view/View;", "v", "<init>", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "b", "()Landroid/widget/TextView;", "methodView", "fileView", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        private static final class C0448b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final TextView methodView;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final TextView fileView;

            public C0448b(View v11) {
                p013kotlin.jvm.internal.s.k(v11, "v");
                View viewFindViewById = v11.findViewById(com.facebook.react.m.f22672v);
                p013kotlin.jvm.internal.s.j(viewFindViewById, "findViewById(...)");
                this.methodView = (TextView) viewFindViewById;
                View viewFindViewById2 = v11.findViewById(com.facebook.react.m.f22671u);
                p013kotlin.jvm.internal.s.j(viewFindViewById2, "findViewById(...)");
                this.fileView = (TextView) viewFindViewById2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final TextView getFileView() {
                return this.fileView;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final TextView getMethodView() {
                return this.methodView;
            }
        }

        public b(String title, pn.k[] stack) {
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(stack, "stack");
            this.title = title;
            this.stack = stack;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.stack.length + 1;
        }

        @Override // android.widget.Adapter
        public Object getItem(int position) {
            return position == 0 ? this.title : this.stack[position - 1];
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int position) {
            return position == 0 ? 0 : 1;
        }

        @Override // android.widget.Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView textView;
            p013kotlin.jvm.internal.s.k(parent, "parent");
            if (position == 0) {
                if (convertView != null) {
                    textView = (TextView) convertView;
                } else {
                    View viewInflate = LayoutInflater.from(parent.getContext()).inflate(com.facebook.react.o.f22882f, parent, false);
                    p013kotlin.jvm.internal.s.i(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                    textView = (TextView) viewInflate;
                }
                textView.setText(new p013kotlin.text.q("\\x1b\\[[0-9;]*m").j(this.title, ""));
                return textView;
            }
            if (convertView == null) {
                convertView = LayoutInflater.from(parent.getContext()).inflate(com.facebook.react.o.f22881e, parent, false);
                p013kotlin.jvm.internal.s.h(convertView);
                convertView.setTag(new C0448b(convertView));
            }
            pn.k kVar = this.stack[position - 1];
            Object tag = convertView.getTag();
            p013kotlin.jvm.internal.s.i(tag, "null cannot be cast to non-null type com.facebook.react.devsupport.RedBoxContentView.StackAdapter.FrameViewHolder");
            C0448b c0448b = (C0448b) tag;
            c0448b.getMethodView().setText(kVar.getMethod());
            c0448b.getFileView().setText(i1.c(kVar));
            c0448b.getMethodView().setTextColor(kVar.b() ? -5592406 : -1);
            c0448b.getFileView().setTextColor(kVar.b() ? -8355712 : -5000269);
            return convertView;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int position) {
            return position > 0;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/facebook/react/devsupport/d1$c", "Lpn/j$a;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements pn.j.a {
        c() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Context context, pn.e devSupportManager, pn.j jVar) {
        super(context);
        p013kotlin.jvm.internal.s.k(devSupportManager, "devSupportManager");
        this.devSupportManager = devSupportManager;
        this.redBoxHandler = jVar;
        this.reportCompletedListener = new c();
        this.reportButtonOnClickListener = new View.OnClickListener() { // from class: com.facebook.react.devsupport.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d1.h(this.f22385a, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(d1 d1Var, View view) {
        d1Var.devSupportManager.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(d1 d1Var, View view) {
        d1Var.devSupportManager.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(d1 d1Var, View view) {
        pn.j jVar = d1Var.redBoxHandler;
        if (jVar == null || !jVar.a() || d1Var.isReporting) {
            return;
        }
        d1Var.isReporting = true;
        TextView textView = d1Var.reportTextView;
        Button button = null;
        if (textView == null) {
            p013kotlin.jvm.internal.s.B("reportTextView");
            textView = null;
        }
        textView.setText("Reporting...");
        TextView textView2 = d1Var.reportTextView;
        if (textView2 == null) {
            p013kotlin.jvm.internal.s.B("reportTextView");
            textView2 = null;
        }
        textView2.setVisibility(0);
        ProgressBar progressBar = d1Var.loadingIndicator;
        if (progressBar == null) {
            p013kotlin.jvm.internal.s.B("loadingIndicator");
            progressBar = null;
        }
        progressBar.setVisibility(0);
        View view2 = d1Var.lineSeparator;
        if (view2 == null) {
            p013kotlin.jvm.internal.s.B("lineSeparator");
            view2 = null;
        }
        view2.setVisibility(0);
        Button button2 = d1Var.reportButton;
        if (button2 == null) {
            p013kotlin.jvm.internal.s.B("reportButton");
        } else {
            button = button2;
        }
        button.setEnabled(false);
        String strU = d1Var.devSupportManager.u();
        if (strU == null) {
            throw new IllegalStateException("Required value was null.");
        }
        pn.k[] kVarArrA = d1Var.devSupportManager.A();
        if (kVarArrA == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String strY = d1Var.devSupportManager.y();
        if (strY == null) {
            throw new IllegalStateException("Required value was null.");
        }
        pn.j jVar2 = d1Var.redBoxHandler;
        Context context = view.getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        jVar2.c(context, strU, kVarArrA, strY, d1Var.reportCompletedListener);
    }

    public final void d() {
        LayoutInflater.from(getContext()).inflate(com.facebook.react.o.f22883g, this);
        ListView listView = (ListView) findViewById(com.facebook.react.m.C);
        listView.setOnItemClickListener(this);
        this.stackView = listView;
        ((Button) findViewById(com.facebook.react.m.f22676z)).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d1.e(this.f22402a, view);
            }
        });
        ((Button) findViewById(com.facebook.react.m.f22673w)).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d1.f(this.f22440a, view);
            }
        });
        pn.j jVar = this.redBoxHandler;
        if (jVar == null || !jVar.a()) {
            return;
        }
        this.loadingIndicator = (ProgressBar) findViewById(com.facebook.react.m.f22675y);
        this.lineSeparator = findViewById(com.facebook.react.m.f22674x);
        TextView textView = (TextView) findViewById(com.facebook.react.m.B);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
        this.reportTextView = textView;
        Button button = (Button) findViewById(com.facebook.react.m.A);
        button.setOnClickListener(this.reportButtonOnClickListener);
        this.reportButton = button;
    }

    public final void g() {
        String strU = this.devSupportManager.u();
        pn.k[] kVarArrA = this.devSupportManager.A();
        if (kVarArrA == null) {
            kVarArrA = new pn.k[0];
        }
        pn.g gVarX = this.devSupportManager.x();
        if (gVarX == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Pair<String, pn.k[]> pairL = this.devSupportManager.l(Pair.create(strU, kVarArrA));
        if (pairL == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object first = pairL.first;
        p013kotlin.jvm.internal.s.j(first, "first");
        Object second = pairL.second;
        p013kotlin.jvm.internal.s.j(second, "second");
        setExceptionDetails((String) first, (pn.k[]) second);
        pn.j jVarO = this.devSupportManager.o();
        if (jVarO != null) {
            jVarO.b(strU, kVarArrA, gVarX);
            i();
        }
    }

    public final void i() {
        pn.j jVar = this.redBoxHandler;
        if (jVar == null || jVar.a()) {
            this.isReporting = false;
            TextView textView = this.reportTextView;
            Button button = null;
            if (textView == null) {
                p013kotlin.jvm.internal.s.B("reportTextView");
                textView = null;
            }
            textView.setVisibility(8);
            ProgressBar progressBar = this.loadingIndicator;
            if (progressBar == null) {
                p013kotlin.jvm.internal.s.B("loadingIndicator");
                progressBar = null;
            }
            progressBar.setVisibility(8);
            View view = this.lineSeparator;
            if (view == null) {
                p013kotlin.jvm.internal.s.B("lineSeparator");
                view = null;
            }
            view.setVisibility(8);
            Button button2 = this.reportButton;
            if (button2 == null) {
                p013kotlin.jvm.internal.s.B("reportButton");
                button2 = null;
            }
            button2.setVisibility(0);
            Button button3 = this.reportButton;
            if (button3 == null) {
                p013kotlin.jvm.internal.s.B("reportButton");
            } else {
                button = button3;
            }
            button.setEnabled(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> parent, View view, int position, long id2) {
        p013kotlin.jvm.internal.s.k(view, "view");
        a aVar = new a(this.devSupportManager);
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        pn.k[] kVarArr = new pn.k[1];
        ListView listView = this.stackView;
        if (listView == null) {
            p013kotlin.jvm.internal.s.B("stackView");
            listView = null;
        }
        Object item = listView.getAdapter().getItem(position);
        p013kotlin.jvm.internal.s.i(item, "null cannot be cast to non-null type com.facebook.react.devsupport.interfaces.StackFrame");
        kVarArr[0] = item;
        aVar.executeOnExecutor(executor, kVarArr);
    }

    public final void setExceptionDetails(String title, pn.k[] stack) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(stack, "stack");
        ListView listView = this.stackView;
        if (listView == null) {
            p013kotlin.jvm.internal.s.B("stackView");
            listView = null;
        }
        listView.setAdapter((ListAdapter) new b(title, stack));
    }
}
