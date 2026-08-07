package rc;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import sc.Size;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Lrc/p;", "", "Lrc/g;", "request", "Lkotlinx/coroutines/Job;", "job", "", "findLifecycle", "Lrc/o;", "a", "(Lrc/g;Lkotlinx/coroutines/Job;Z)Lrc/o;", DateTokenConverter.CONVERTER_KEY, "(Lrc/g;)Lrc/g;", "Lsc/g;", "size", "Lrc/n;", "c", "(Lrc/g;Lsc/g;)Lrc/n;", "options", "b", "(Lrc/n;)Lrc/n;", "Lmc/d$c;", "cacheValue", "e", "(Lrc/g;Lmc/d$c;)Z", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface p {
    o a(ImageRequest request, Job job, boolean findLifecycle);

    Options b(Options options);

    Options c(ImageRequest request, Size size);

    ImageRequest d(ImageRequest request);

    boolean e(ImageRequest request, mc.d.Value cacheValue);
}
