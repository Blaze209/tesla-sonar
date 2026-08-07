package com.fourthline.vision;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.core.internal.devicedata.MotionFrame;
import com.fourthline.core.internal.devicedata.MotionFrame$$serializer;
import com.fourthline.core.internal.devicedata.MotionTimestampSerializer;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.p;
import to0.f;
import vo0.e;
import vo0.h1;
import vo0.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bBM\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0007\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ*\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001fR \u0010\u000b\u001a\u00020\t8\u0006X\u0087D¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b4\u0010-\u001a\u0004\b3\u0010%R \u0010\r\u001a\u00020\f8\u0006X\u0087D¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b8\u0010-\u001a\u0004\b7\u0010#R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087D¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010-\u001a\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/fourthline/vision/MotionData;", "", "", "videoStartTimestamp", "", "Lcom/fourthline/core/internal/devicedata/MotionFrame;", "motionFrames", "<init>", "(JLjava/util/List;)V", "", "seen0", "version", "", "platform", "", "attitudeIsAbsolute", "Lvo0/v1;", "serializationConstructorMarker", "(IJLjava/util/List;ILjava/lang/String;ZLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_vision_release", "(Lcom/fourthline/vision/MotionData;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()J", "component2", "()Ljava/util/List;", "copy", "(JLjava/util/List;)Lcom/fourthline/vision/MotionData;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getVideoStartTimestamp", "getVideoStartTimestamp$annotations", "()V", "b", "Ljava/util/List;", "getMotionFrames", "c", "I", "getVersion", "getVersion$annotations", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getPlatform", "getPlatform$annotations", "e", "Z", "getAttitudeIsAbsolute", "()Z", "getAttitudeIsAbsolute$annotations", "Companion", "$serializer", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class MotionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long videoStartTimestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List motionFrames;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String platform;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean attitudeIsAbsolute;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ro0.d[] f37529f = {new MotionTimestampSerializer(), new e(MotionFrame$$serializer.INSTANCE), null, null, null};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/vision/MotionData$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/vision/MotionData;", "serializer", "()Lro0/d;", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<MotionData> serializer() {
            return MotionData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MotionData(int i11, long j11, List list, int i12, String str, boolean z11, v1 v1Var) {
        if (3 != (i11 & 3)) {
            h1.b(i11, 3, MotionData$$serializer.INSTANCE.getDescriptor());
        }
        this.videoStartTimestamp = j11;
        this.motionFrames = list;
        if ((i11 & 4) == 0) {
            this.version = 1;
        } else {
            this.version = i12;
        }
        if ((i11 & 8) == 0) {
            this.platform = "android";
        } else {
            this.platform = str;
        }
        if ((i11 & 16) == 0) {
            this.attitudeIsAbsolute = true;
        } else {
            this.attitudeIsAbsolute = z11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MotionData copy$default(MotionData motionData, long j11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = motionData.videoStartTimestamp;
        }
        if ((i11 & 2) != 0) {
            list = motionData.motionFrames;
        }
        return motionData.copy(j11, list);
    }

    public static /* synthetic */ void getAttitudeIsAbsolute$annotations() {
    }

    public static /* synthetic */ void getPlatform$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    @p(with = MotionTimestampSerializer.class)
    public static /* synthetic */ void getVideoStartTimestamp$annotations() {
    }

    public static final /* synthetic */ void write$Self$fourthline_vision_release(MotionData self, uo0.d output, f serialDesc) {
        ro0.d[] dVarArr = f37529f;
        output.D(serialDesc, 0, dVarArr[0], Long.valueOf(self.videoStartTimestamp));
        output.D(serialDesc, 1, dVarArr[1], self.motionFrames);
        output.x(serialDesc, 2, self.version);
        output.e(serialDesc, 3, self.platform);
        output.A(serialDesc, 4, self.attitudeIsAbsolute);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getVideoStartTimestamp() {
        return this.videoStartTimestamp;
    }

    public final List<MotionFrame> component2() {
        return this.motionFrames;
    }

    public final MotionData copy(long videoStartTimestamp, List<MotionFrame> motionFrames) {
        s.k(motionFrames, "motionFrames");
        return new MotionData(videoStartTimestamp, motionFrames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MotionData)) {
            return false;
        }
        MotionData motionData = (MotionData) other;
        return this.videoStartTimestamp == motionData.videoStartTimestamp && s.f(this.motionFrames, motionData.motionFrames);
    }

    public final boolean getAttitudeIsAbsolute() {
        return this.attitudeIsAbsolute;
    }

    public final List<MotionFrame> getMotionFrames() {
        return this.motionFrames;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final int getVersion() {
        return this.version;
    }

    public final long getVideoStartTimestamp() {
        return this.videoStartTimestamp;
    }

    public int hashCode() {
        return (Long.hashCode(this.videoStartTimestamp) * 31) + this.motionFrames.hashCode();
    }

    public String toString() {
        return "MotionData(videoStartTimestamp=" + this.videoStartTimestamp + ", motionFrames=" + this.motionFrames + ")";
    }

    public MotionData(long j11, List<MotionFrame> motionFrames) {
        s.k(motionFrames, "motionFrames");
        this.videoStartTimestamp = j11;
        this.motionFrames = motionFrames;
        this.version = 1;
        this.platform = "android";
        this.attitudeIsAbsolute = true;
    }
}
