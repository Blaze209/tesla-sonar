package wo0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import xo0.p0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lwo0/t;", "Lwo0/b;", "Lwo0/f;", "configuration", "Lyo0/c;", "module", "<init>", "(Lwo0/f;Lyo0/c;)V", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class t extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(JsonConfiguration configuration, yo0.c module) {
        super(configuration, module, null);
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        p013kotlin.jvm.internal.s.k(module, "module");
        i();
    }

    private final void i() {
        if (p013kotlin.jvm.internal.s.f(getSerializersModule(), yo0.d.a())) {
            return;
        }
        getSerializersModule().a(new p0(getConfiguration().getUseArrayPolymorphism(), getConfiguration().getClassDiscriminator()));
    }
}
