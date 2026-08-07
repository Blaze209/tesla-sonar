package lo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Llo0/r;", "Lno0/r;", "Llo0/h;", "Llo0/s;", "names", "<init>", "(Llo0/s;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", DateTokenConverter.CONVERTER_KEY, "Llo0/s;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class r extends no0.r<h> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s names;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s names) {
        super(i.f90515a.b(), names.b(), "dayOfWeekName");
        p013kotlin.jvm.internal.s.k(names, "names");
        this.names = names;
    }

    public boolean equals(Object other) {
        return (other instanceof r) && p013kotlin.jvm.internal.s.f(this.names.b(), ((r) other).names.b());
    }

    public int hashCode() {
        return this.names.b().hashCode();
    }
}
