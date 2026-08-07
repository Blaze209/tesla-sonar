package q20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.wallet.WalletConstants;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0010\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u00020\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001b"}, d2 = {"Lq20/j;", "", "", "statusCode", "", "oversize", "", "", "eventIds", "<init>", "(IZLjava/util/List;)V", "", "customRetryForStatusCodes", "retryAllowed", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;Z)Z", "a", "I", "b", "()I", "Z", "getOversize", "()Z", "c", "Ljava/util/List;", "()Ljava/util/List;", "isSuccessful", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int statusCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean oversize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Long> eventIds;

    public j(int i11, boolean z11, List<Long> eventIds) {
        s.k(eventIds, "eventIds");
        this.statusCode = i11;
        this.oversize = z11;
        this.eventIds = eventIds;
    }

    public final List<Long> a() {
        return this.eventIds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    public final boolean c() {
        int i11 = this.statusCode;
        return 200 <= i11 && i11 < 300;
    }

    public final boolean d(Map<Integer, Boolean> customRetryForStatusCodes, boolean retryAllowed) {
        if (c() || !retryAllowed || this.oversize) {
            return false;
        }
        if (customRetryForStatusCodes == null || !customRetryForStatusCodes.containsKey(Integer.valueOf(this.statusCode))) {
            return !new HashSet(v.p(400, Integer.valueOf(HttpStatusCode.UNAUTHORIZED_401), Integer.valueOf(DownloaderService.STATUS_FORBIDDEN), Integer.valueOf(WalletConstants.ERROR_CODE_INVALID_TRANSACTION), Integer.valueOf(HttpStatusCode.UNPROCESSABLE_ENTITY_422))).contains(Integer.valueOf(this.statusCode));
        }
        Boolean bool = customRetryForStatusCodes.get(Integer.valueOf(this.statusCode));
        s.h(bool);
        return bool.booleanValue();
    }
}
