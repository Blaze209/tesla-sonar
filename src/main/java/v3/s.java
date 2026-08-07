package v3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lv3/s;", "", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f117771a;

    /* JADX INFO: renamed from: v3.s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u0012"}, d2 = {"Lv3/s$a;", "", "<init>", "()V", "Lv3/s;", "b", "Lv3/s;", "a", "()Lv3/s;", "Default", "c", "getCrosshair", "Crosshair", DateTokenConverter.CONVERTER_KEY, "getText", "Text", "e", "Hand", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f117771a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final s Default = v.c();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final s Crosshair = v.b();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final s Text = v.e();

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final s Hand = v.d();

        private Companion() {
        }

        public final s a() {
            return Default;
        }

        public final s b() {
            return Hand;
        }
    }
}
