package androidx.camera.core.impl;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/camera/core/impl/h1;", "", "<init>", "()V", "Lc0/b0;", "dynamicRangeToTest", "", "fullySpecifiedDynamicRanges", "", "c", "(Lc0/b0;Ljava/util/Set;)Z", "underSpecifiedDynamicRange", "fullySpecifiedDynamicRange", DateTokenConverter.CONVERTER_KEY, "(Lc0/b0;Lc0/b0;)Z", "a", "b", "camera-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f3188a = new h1();

    private h1() {
    }

    private final boolean a(c0.b0 dynamicRangeToTest, c0.b0 fullySpecifiedDynamicRange) {
        u5.h.j(fullySpecifiedDynamicRange.e(), "Fully specified range is not actually fully specified.");
        return dynamicRangeToTest.a() == 0 || dynamicRangeToTest.a() == fullySpecifiedDynamicRange.a();
    }

    private final boolean b(c0.b0 dynamicRangeToTest, c0.b0 fullySpecifiedDynamicRange) {
        u5.h.j(fullySpecifiedDynamicRange.e(), "Fully specified range is not actually fully specified.");
        int iB = dynamicRangeToTest.b();
        if (iB == 0) {
            return true;
        }
        int iB2 = fullySpecifiedDynamicRange.b();
        return (iB == 2 && iB2 != 1) || iB == iB2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0036 A[RETURN] */
    public static final boolean c(c0.b0 dynamicRangeToTest, Set<c0.b0> fullySpecifiedDynamicRanges) {
        p013kotlin.jvm.internal.s.k(dynamicRangeToTest, "dynamicRangeToTest");
        p013kotlin.jvm.internal.s.k(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangeToTest.e()) {
            return fullySpecifiedDynamicRanges.contains(dynamicRangeToTest);
        }
        for (Object obj : fullySpecifiedDynamicRanges) {
            if (f3188a.d(dynamicRangeToTest, (c0.b0) obj)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    private final boolean d(c0.b0 underSpecifiedDynamicRange, c0.b0 fullySpecifiedDynamicRange) {
        return a(underSpecifiedDynamicRange, fullySpecifiedDynamicRange) && b(underSpecifiedDynamicRange, fullySpecifiedDynamicRange);
    }
}
