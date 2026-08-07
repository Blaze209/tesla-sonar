package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import java.util.concurrent.TimeUnit;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4203h2 implements wn0.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f38365d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f38366e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimestampProvider f38367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4234l4 f38368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.a f38369c;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.h2$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.h2$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC4211i2.values().length];
            try {
                iArr[EnumC4211i2.STEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4211i2.INVALID_DETECTION_AREA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4211i2.AUTO_DETECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C4203h2(TimestampProvider timestampProvider, InterfaceC4234l4 detectionAreaProvider, wn0.a<Long> autoDetectStepDurationFactory) {
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(detectionAreaProvider, "detectionAreaProvider");
        p013kotlin.jvm.internal.s.k(autoDetectStepDurationFactory, "autoDetectStepDurationFactory");
        this.f38367a = timestampProvider;
        this.f38368b = detectionAreaProvider;
        this.f38369c = autoDetectStepDurationFactory;
    }

    @Override // wn0.l
    public AbstractC4222k invoke(EnumC4211i2 documentTimeoutType) {
        p013kotlin.jvm.internal.s.k(documentTimeoutType, "documentTimeoutType");
        int i11 = b.$EnumSwitchMapping$0[documentTimeoutType.ordinal()];
        if (i11 == 1) {
            return new O5(this.f38367a, 40L, TimeUnit.SECONDS);
        }
        if (i11 == 2) {
            return new S2(this.f38368b, this.f38367a, 250L, TimeUnit.MILLISECONDS);
        }
        if (i11 == 3) {
            return new C4157b4(this.f38367a, ((Number) this.f38369c.invoke()).longValue(), TimeUnit.SECONDS);
        }
        throw new NoWhenBranchMatchedException();
    }
}
