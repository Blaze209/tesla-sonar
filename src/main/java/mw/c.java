package mw;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.firebase.perf.util.m;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.net.URI;

/* JADX INFO: loaded from: classes5.dex */
final class c extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kw.a f92525d = kw.a.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NetworkRequestMetric f92526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f92527c;

    c(NetworkRequestMetric networkRequestMetric, Context context) {
        this.f92527c = context;
        this.f92526b = networkRequestMetric;
    }

    private URI g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e11) {
            f92525d.k("getResultUrl throws exception %s", e11.getMessage());
            return null;
        }
    }

    private boolean h(URI uri, @NonNull Context context) {
        if (uri == null) {
            return false;
        }
        return m.a(uri, context);
    }

    private boolean i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    private boolean j(String str) {
        return i(str);
    }

    private boolean k(String str) {
        return (str == null || i(str) || str.length() > 255) ? false : true;
    }

    private boolean m(int i11) {
        return i11 > 0;
    }

    private boolean n(long j11) {
        return j11 >= 0;
    }

    private boolean o(int i11) {
        return i11 == -1 || i11 > 0;
    }

    private boolean p(String str) {
        if (str == null) {
            return false;
        }
        return "http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    private boolean q(long j11) {
        return j11 >= 0;
    }

    private boolean r(String str) {
        return str == null;
    }

    @Override // mw.e
    public boolean c() {
        if (j(this.f92526b.getUrl())) {
            f92525d.j("URL is missing:" + this.f92526b.getUrl());
            return false;
        }
        URI uriG = g(this.f92526b.getUrl());
        if (uriG == null) {
            f92525d.j("URL cannot be parsed");
            return false;
        }
        if (!h(uriG, this.f92527c)) {
            f92525d.j("URL fails allowlist rule: " + uriG);
            return false;
        }
        if (!k(uriG.getHost())) {
            f92525d.j("URL host is null or invalid");
            return false;
        }
        if (!p(uriG.getScheme())) {
            f92525d.j("URL scheme is null or invalid");
            return false;
        }
        if (!r(uriG.getUserInfo())) {
            f92525d.j("URL user info is null");
            return false;
        }
        if (!o(uriG.getPort())) {
            f92525d.j("URL port is less than or equal to 0");
            return false;
        }
        if (!l(this.f92526b.hasHttpMethod() ? this.f92526b.getHttpMethod() : null)) {
            f92525d.j("HTTP Method is null or invalid: " + this.f92526b.getHttpMethod());
            return false;
        }
        if (this.f92526b.hasHttpResponseCode() && !m(this.f92526b.getHttpResponseCode())) {
            f92525d.j("HTTP ResponseCode is a negative value:" + this.f92526b.getHttpResponseCode());
            return false;
        }
        if (this.f92526b.hasRequestPayloadBytes() && !n(this.f92526b.getRequestPayloadBytes())) {
            f92525d.j("Request Payload is a negative value:" + this.f92526b.getRequestPayloadBytes());
            return false;
        }
        if (this.f92526b.hasResponsePayloadBytes() && !n(this.f92526b.getResponsePayloadBytes())) {
            f92525d.j("Response Payload is a negative value:" + this.f92526b.getResponsePayloadBytes());
            return false;
        }
        if (!this.f92526b.hasClientStartTimeUs() || this.f92526b.getClientStartTimeUs() <= 0) {
            f92525d.j("Start time of the request is null, or zero, or a negative value:" + this.f92526b.getClientStartTimeUs());
            return false;
        }
        if (this.f92526b.hasTimeToRequestCompletedUs() && !q(this.f92526b.getTimeToRequestCompletedUs())) {
            f92525d.j("Time to complete the request is a negative value:" + this.f92526b.getTimeToRequestCompletedUs());
            return false;
        }
        if (this.f92526b.hasTimeToResponseInitiatedUs() && !q(this.f92526b.getTimeToResponseInitiatedUs())) {
            f92525d.j("Time from the start of the request to the start of the response is null or a negative value:" + this.f92526b.getTimeToResponseInitiatedUs());
            return false;
        }
        if (this.f92526b.hasTimeToResponseCompletedUs() && this.f92526b.getTimeToResponseCompletedUs() > 0) {
            if (this.f92526b.hasHttpResponseCode()) {
                return true;
            }
            f92525d.j("Did not receive a HTTP Response Code");
            return false;
        }
        f92525d.j("Time from the start of the request to the end of the response is null, negative or zero:" + this.f92526b.getTimeToResponseCompletedUs());
        return false;
    }

    boolean l(NetworkRequestMetric.d dVar) {
        return (dVar == null || dVar == NetworkRequestMetric.d.HTTP_METHOD_UNKNOWN) ? false : true;
    }
}
