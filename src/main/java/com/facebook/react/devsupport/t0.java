package com.facebook.react.devsupport;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/devsupport/t0;", "", "Lokhttp3/OkHttpClient;", "client", "<init>", "(Lokhttp3/OkHttpClient;)V", "", "host", "Lpn/h;", "callback", "Ljn0/h0;", "a", "(Ljava/lang/String;Lpn/h;)V", "Lokhttp3/OkHttpClient;", "b", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f22568b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OkHttpClient client;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/devsupport/t0$a;", "", "<init>", "()V", "", "host", "b", "(Ljava/lang/String;)Ljava/lang/String;", "PACKAGER_OK_STATUS", "Ljava/lang/String;", "", "HTTP_CONNECT_TIMEOUT_MS", "I", "PACKAGER_STATUS_URL_TEMPLATE", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(String host) {
            p013kotlin.jvm.internal.t0 t0Var = p013kotlin.jvm.internal.t0.f86535a;
            String str = String.format(Locale.US, "http://%s/status", Arrays.copyOf(new Object[]{host}, 1));
            p013kotlin.jvm.internal.s.j(str, "format(...)");
            return str;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/facebook/react/devsupport/t0$b", "Lokhttp3/Callback;", "Lokhttp3/Call;", "call", "Ljava/io/IOException;", "e", "Ljn0/h0;", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "Lokhttp3/Response;", "response", "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pn.h f22570a;

        b(pn.h hVar) {
            this.f22570a = hVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e11) {
            p013kotlin.jvm.internal.s.k(call, "call");
            p013kotlin.jvm.internal.s.k(e11, "e");
            qk.a.I("ReactNative", "The packager does not seem to be running as we got an IOException requesting its status: " + e11.getMessage());
            this.f22570a.a(false);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            p013kotlin.jvm.internal.s.k(call, "call");
            p013kotlin.jvm.internal.s.k(response, "response");
            if (!response.isSuccessful()) {
                qk.a.m("ReactNative", "Got non-success http code from packager when requesting status: " + response.getCode());
                this.f22570a.a(false);
                return;
            }
            ResponseBody body = response.getBody();
            if (body == null) {
                qk.a.m("ReactNative", "Got null body response from packager when requesting status");
                this.f22570a.a(false);
                return;
            }
            String strString = body.string();
            if (p013kotlin.jvm.internal.s.f("packager-status:running", strString)) {
                this.f22570a.a(true);
                return;
            }
            qk.a.m("ReactNative", "Got unexpected response from packager when requesting status: " + strString);
            this.f22570a.a(false);
        }
    }

    public t0(OkHttpClient client) {
        p013kotlin.jvm.internal.s.k(client, "client");
        this.client = client;
    }

    public final void a(String host, pn.h callback) {
        p013kotlin.jvm.internal.s.k(host, "host");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        FirebasePerfOkHttpClient.enqueue(this.client.newCall(new Request.Builder().url(f22568b.b(host)).build()), new b(callback));
    }
}
