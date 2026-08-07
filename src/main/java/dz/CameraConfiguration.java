package dz;

import android.util.Range;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import fz.CameraDeviceFormat;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: dz.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bN\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 i2\u00020\u0001:\n0IJA3?C>&;Bé\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\u0012\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0004¢\u0006\u0004\b$\u0010%Jò\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00122\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0004HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010/\u001a\u0004\b0\u0010)\"\u0004\b1\u00102R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00104\u001a\u0004\b9\u00106\"\u0004\b:\u00108R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00104\u001a\u0004\b<\u00106\"\u0004\b=\u00108R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00104\u001a\u0004\b?\u00106\"\u0004\b@\u00108R(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00104\u001a\u0004\b;\u00106\"\u0004\bB\u00108R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010L\u001a\u0004\b>\u0010M\"\u0004\bN\u0010OR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010U\u001a\u0004\bI\u0010V\"\u0004\bW\u0010XR\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010L\u001a\u0004\bA\u0010M\"\u0004\bY\u0010OR\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bC\u0010f\"\u0004\bg\u0010hR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010S\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010!\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010L\u001a\u0004\bm\u0010M\"\u0004\bn\u0010OR(\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u00104\u001a\u0004\bo\u00106\"\u0004\bp\u00108R\u0019\u0010s\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010q8F¢\u0006\u0006\u001a\u0004\bd\u0010r¨\u0006t"}, d2 = {"Ldz/a;", "", "", "cameraId", "Ldz/a$g;", "Ldz/a$i;", "preview", "Ldz/a$h;", "photo", "Ldz/a$j;", MediaStreamTrack.VIDEO_TRACK_KIND, "Ldz/a$f;", "frameProcessor", "Ldz/a$c;", "codeScanner", "", "minFps", "maxFps", "", "enableLocation", "Lfz/j;", "outputOrientation", "Lfz/b;", "format", "enableLowLightBoost", "Lfz/u;", "torch", "Lfz/y;", "videoStabilizationMode", "", "exposure", "", "zoom", "isActive", "Ldz/a$b;", MediaStreamTrack.AUDIO_TRACK_KIND, "<init>", "(Ljava/lang/String;Ldz/a$g;Ldz/a$g;Ldz/a$g;Ldz/a$g;Ldz/a$g;Ljava/lang/Integer;Ljava/lang/Integer;ZLfz/j;Lfz/b;ZLfz/u;Lfz/y;Ljava/lang/Double;FZLdz/a$g;)V", "a", "(Ljava/lang/String;Ldz/a$g;Ldz/a$g;Ldz/a$g;Ldz/a$g;Ldz/a$g;Ljava/lang/Integer;Ljava/lang/Integer;ZLfz/j;Lfz/b;ZLfz/u;Lfz/y;Ljava/lang/Double;FZLdz/a$g;)Ldz/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "w", "(Ljava/lang/String;)V", "b", "Ldz/a$g;", "n", "()Ldz/a$g;", "H", "(Ldz/a$g;)V", "m", "G", DateTokenConverter.CONVERTER_KEY, "q", "J", "e", IntegerTokenConverter.CONVERTER_KEY, "C", "f", "x", "g", "Ljava/lang/Integer;", "k", "()Ljava/lang/Integer;", "E", "(Ljava/lang/Integer;)V", "h", "j", "D", "Z", "()Z", "y", "(Z)V", "Lfz/j;", "l", "()Lfz/j;", Gender.FEMALE, "(Lfz/j;)V", "Lfz/b;", "()Lfz/b;", "B", "(Lfz/b;)V", "z", "Lfz/u;", "p", "()Lfz/u;", "I", "(Lfz/u;)V", "Lfz/y;", "r", "()Lfz/y;", "setVideoStabilizationMode", "(Lfz/y;)V", "o", "Ljava/lang/Double;", "()Ljava/lang/Double;", "A", "(Ljava/lang/Double;)V", "s", "()F", "K", "(F)V", "t", "u", "getAudio", "v", "Landroid/util/Range;", "()Landroid/util/Range;", "targetFpsRange", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CameraConfiguration {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String cameraId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private g<Preview> preview;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private g<Photo> photo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private g<Video> video;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private g<FrameProcessor> frameProcessor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private g<CodeScanner> codeScanner;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer minFps;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer maxFps;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean enableLocation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private fz.j outputOrientation;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private CameraDeviceFormat format;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean enableLowLightBoost;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private fz.u torch;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private fz.y videoStabilizationMode;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private Double exposure;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private float zoom;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isActive;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private g<Audio> audio;

    /* JADX INFO: renamed from: dz.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldz/a$a;", "", "<init>", "()V", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1247a extends Throwable {
    }

    /* JADX INFO: renamed from: dz.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ldz/a$b;", "", "Ljn0/h0;", "nothing", "<init>", "(Ljn0/h0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljn0/h0;", "getNothing", "()Ljn0/h0;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Audio {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final jn0.h0 nothing;

        public Audio(jn0.h0 nothing) {
            p013kotlin.jvm.internal.s.k(nothing, "nothing");
            this.nothing = nothing;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Audio) && p013kotlin.jvm.internal.s.f(this.nothing, ((Audio) other).nothing);
        }

        public int hashCode() {
            return this.nothing.hashCode();
        }

        public String toString() {
            return "Audio(nothing=" + this.nothing + ")";
        }
    }

    /* JADX INFO: renamed from: dz.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ldz/a$c;", "", "", "Lfz/d;", "codeTypes", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CodeScanner {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<fz.d> codeTypes;

        /* JADX WARN: Multi-variable type inference failed */
        public CodeScanner(List<? extends fz.d> codeTypes) {
            p013kotlin.jvm.internal.s.k(codeTypes, "codeTypes");
            this.codeTypes = codeTypes;
        }

        public final List<fz.d> a() {
            return this.codeTypes;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CodeScanner) && p013kotlin.jvm.internal.s.f(this.codeTypes, ((CodeScanner) other).codeTypes);
        }

        public int hashCode() {
            return this.codeTypes.hashCode();
        }

        public String toString() {
            return "CodeScanner(codeTypes=" + this.codeTypes + ")";
        }
    }

    /* JADX INFO: renamed from: dz.a$d, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ldz/a$d;", "", "<init>", "()V", "Ldz/a;", "other", "a", "(Ldz/a;)Ldz/a;", "left", "right", "Ldz/a$e;", "b", "(Ldz/a;Ldz/a;)Ldz/a$e;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CameraConfiguration a(CameraConfiguration other) {
            CameraConfiguration cameraConfigurationB;
            return (other == null || (cameraConfigurationB = CameraConfiguration.b(other, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, BitmapDescriptorFactory.HUE_RED, false, null, 262143, null)) == null) ? new CameraConfiguration(null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, BitmapDescriptorFactory.HUE_RED, false, null, 262143, null) : cameraConfigurationB;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:50:0x00d9  */
        public final Difference b(CameraConfiguration left, CameraConfiguration right) {
            boolean z11;
            boolean z12;
            p013kotlin.jvm.internal.s.k(right, "right");
            boolean z13 = false;
            boolean z14 = (p013kotlin.jvm.internal.s.f(left != null ? left.m() : null, right.m()) && p013kotlin.jvm.internal.s.f(left.q(), right.q()) && left.getEnableLowLightBoost() == right.getEnableLowLightBoost() && left.getVideoStabilizationMode() == right.getVideoStabilizationMode() && p013kotlin.jvm.internal.s.f(left.i(), right.i()) && p013kotlin.jvm.internal.s.f(left.d(), right.d()) && p013kotlin.jvm.internal.s.f(left.n(), right.n()) && p013kotlin.jvm.internal.s.f(left.getFormat(), right.getFormat()) && p013kotlin.jvm.internal.s.f(left.getMinFps(), right.getMinFps()) && p013kotlin.jvm.internal.s.f(left.getMaxFps(), right.getMaxFps())) ? false : true;
            if (z14) {
                z11 = true;
            } else {
                if (p013kotlin.jvm.internal.s.f(left != null ? left.getCameraId() : null, right.getCameraId())) {
                    z11 = false;
                } else {
                    z11 = true;
                }
            }
            if (z11) {
                z12 = true;
            } else {
                if ((left != null ? left.getTorch() : null) == right.getTorch() && left.getZoom() == right.getZoom() && p013kotlin.jvm.internal.s.c(left.getExposure(), right.getExposure())) {
                    z12 = false;
                } else {
                    z12 = true;
                }
            }
            boolean z15 = !(left != null && left.getIsActive() == right.getIsActive());
            boolean z16 = (left != null ? left.getOutputOrientation() : null) != right.getOutputOrientation();
            if (left != null && left.getEnableLocation() == right.getEnableLocation()) {
                z13 = true;
            }
            return new Difference(z11, z14, z12, z15, z16, !z13);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: dz.a$e, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u001d\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001e"}, d2 = {"Ldz/a$e;", "", "", "deviceChanged", "outputsChanged", "sidePropsChanged", "isActiveChanged", "orientationChanged", "locationChanged", "<init>", "(ZZZZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "e", "c", "f", DateTokenConverter.CONVERTER_KEY, "g", "hasChanges", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Difference {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean deviceChanged;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean outputsChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean sidePropsChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isActiveChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean orientationChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean locationChanged;

        public Difference(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
            this.deviceChanged = z11;
            this.outputsChanged = z12;
            this.sidePropsChanged = z13;
            this.isActiveChanged = z14;
            this.orientationChanged = z15;
            this.locationChanged = z16;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDeviceChanged() {
            return this.deviceChanged;
        }

        public final boolean b() {
            return this.deviceChanged || this.outputsChanged || this.sidePropsChanged || this.isActiveChanged || this.orientationChanged || this.locationChanged;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getLocationChanged() {
            return this.locationChanged;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getOrientationChanged() {
            return this.orientationChanged;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getOutputsChanged() {
            return this.outputsChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Difference)) {
                return false;
            }
            Difference difference = (Difference) other;
            return this.deviceChanged == difference.deviceChanged && this.outputsChanged == difference.outputsChanged && this.sidePropsChanged == difference.sidePropsChanged && this.isActiveChanged == difference.isActiveChanged && this.orientationChanged == difference.orientationChanged && this.locationChanged == difference.locationChanged;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getSidePropsChanged() {
            return this.sidePropsChanged;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsActiveChanged() {
            return this.isActiveChanged;
        }

        public int hashCode() {
            return (((((((((Boolean.hashCode(this.deviceChanged) * 31) + Boolean.hashCode(this.outputsChanged)) * 31) + Boolean.hashCode(this.sidePropsChanged)) * 31) + Boolean.hashCode(this.isActiveChanged)) * 31) + Boolean.hashCode(this.orientationChanged)) * 31) + Boolean.hashCode(this.locationChanged);
        }

        public String toString() {
            return "Difference(deviceChanged=" + this.deviceChanged + ", outputsChanged=" + this.outputsChanged + ", sidePropsChanged=" + this.sidePropsChanged + ", isActiveChanged=" + this.isActiveChanged + ", orientationChanged=" + this.orientationChanged + ", locationChanged=" + this.locationChanged + ")";
        }
    }

    /* JADX INFO: renamed from: dz.a$f, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Ldz/a$f;", "", "", "isMirrored", "Lfz/l;", "pixelFormat", "<init>", "(ZLfz/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lfz/l;", "()Lfz/l;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FrameProcessor {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isMirrored;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.l pixelFormat;

        public FrameProcessor(boolean z11, fz.l pixelFormat) {
            p013kotlin.jvm.internal.s.k(pixelFormat, "pixelFormat");
            this.isMirrored = z11;
            this.pixelFormat = pixelFormat;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final fz.l getPixelFormat() {
            return this.pixelFormat;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FrameProcessor)) {
                return false;
            }
            FrameProcessor frameProcessor = (FrameProcessor) other;
            return this.isMirrored == frameProcessor.isMirrored && this.pixelFormat == frameProcessor.pixelFormat;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isMirrored) * 31) + this.pixelFormat.hashCode();
        }

        public String toString() {
            return "FrameProcessor(isMirrored=" + this.isMirrored + ", pixelFormat=" + this.pixelFormat + ")";
        }
    }

    /* JADX INFO: renamed from: dz.a$g */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Ldz/a$g;", "T", "", "<init>", "()V", "a", "b", "Ldz/a$g$a;", "Ldz/a$g$b;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class g<T> {

        /* JADX INFO: renamed from: dz.a$g$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \n*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ldz/a$g$a;", "T", "Ldz/a$g;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1248a<T> extends g<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: dz.a$g$a$a, reason: collision with other inner class name and from kotlin metadata */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\"\u0004\b\u0002\u0010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldz/a$g$a$a;", "", "<init>", "()V", "T", "Ldz/a$g$a;", "a", "()Ldz/a$g$a;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final <T> C1248a<T> a() {
                    return new C1248a<>(null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ C1248a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public boolean equals(Object other) {
                return other instanceof C1248a;
            }

            private C1248a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: dz.a$g$b */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u000e*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Ldz/a$g$b;", "T", "Ldz/a$g;", "config", "<init>", "(Ljava/lang/Object;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b<T> extends g<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final T config;

            /* JADX INFO: renamed from: dz.a$g$b$a, reason: collision with other inner class name and from kotlin metadata */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ldz/a$g$b$a;", "", "<init>", "()V", "T", "config", "Ldz/a$g$b;", "a", "(Ljava/lang/Object;)Ldz/a$g$b;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final <T> b<T> a(T config) {
                    return new b<>(config, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ b(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj);
            }

            public final T a() {
                return this.config;
            }

            public boolean equals(Object other) {
                return (other instanceof b) && p013kotlin.jvm.internal.s.f(this.config, ((b) other).config);
            }

            private b(T t11) {
                super(null);
                this.config = t11;
            }
        }

        public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private g() {
        }
    }

    /* JADX INFO: renamed from: dz.a$h, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Ldz/a$h;", "", "", "isMirrored", "enableHdr", "Lfz/o;", "photoQualityBalance", "<init>", "(ZZLfz/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Lfz/o;", "()Lfz/o;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Photo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isMirrored;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enableHdr;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.o photoQualityBalance;

        public Photo(boolean z11, boolean z12, fz.o photoQualityBalance) {
            p013kotlin.jvm.internal.s.k(photoQualityBalance, "photoQualityBalance");
            this.isMirrored = z11;
            this.enableHdr = z12;
            this.photoQualityBalance = photoQualityBalance;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEnableHdr() {
            return this.enableHdr;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final fz.o getPhotoQualityBalance() {
            return this.photoQualityBalance;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsMirrored() {
            return this.isMirrored;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Photo)) {
                return false;
            }
            Photo photo = (Photo) other;
            return this.isMirrored == photo.isMirrored && this.enableHdr == photo.enableHdr && this.photoQualityBalance == photo.photoQualityBalance;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isMirrored) * 31) + Boolean.hashCode(this.enableHdr)) * 31) + this.photoQualityBalance.hashCode();
        }

        public String toString() {
            return "Photo(isMirrored=" + this.isMirrored + ", enableHdr=" + this.enableHdr + ", photoQualityBalance=" + this.photoQualityBalance + ")";
        }
    }

    /* JADX INFO: renamed from: dz.a$i, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Ldz/a$i;", "", "Lc0/h1$c;", "surfaceProvider", "<init>", "(Lc0/h1$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc0/h1$c;", "()Lc0/h1$c;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Preview {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c0.h1.c surfaceProvider;

        public Preview(c0.h1.c surfaceProvider) {
            p013kotlin.jvm.internal.s.k(surfaceProvider, "surfaceProvider");
            this.surfaceProvider = surfaceProvider;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c0.h1.c getSurfaceProvider() {
            return this.surfaceProvider;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Preview) && p013kotlin.jvm.internal.s.f(this.surfaceProvider, ((Preview) other).surfaceProvider);
        }

        public int hashCode() {
            return this.surfaceProvider.hashCode();
        }

        public String toString() {
            return "Preview(surfaceProvider=" + this.surfaceProvider + ")";
        }
    }

    /* JADX INFO: renamed from: dz.a$j, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Ldz/a$j;", "", "", "isMirrored", "enableHdr", "", "bitRateOverride", "bitRateMultiplier", "<init>", "(ZZLjava/lang/Double;Ljava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "b", "c", "Ljava/lang/Double;", "()Ljava/lang/Double;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Video {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isMirrored;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enableHdr;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double bitRateOverride;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double bitRateMultiplier;

        public Video(boolean z11, boolean z12, Double d11, Double d12) {
            this.isMirrored = z11;
            this.enableHdr = z12;
            this.bitRateOverride = d11;
            this.bitRateMultiplier = d12;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getBitRateMultiplier() {
            return this.bitRateMultiplier;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Double getBitRateOverride() {
            return this.bitRateOverride;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getEnableHdr() {
            return this.enableHdr;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsMirrored() {
            return this.isMirrored;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Video)) {
                return false;
            }
            Video video = (Video) other;
            return this.isMirrored == video.isMirrored && this.enableHdr == video.enableHdr && p013kotlin.jvm.internal.s.f(this.bitRateOverride, video.bitRateOverride) && p013kotlin.jvm.internal.s.f(this.bitRateMultiplier, video.bitRateMultiplier);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.isMirrored) * 31) + Boolean.hashCode(this.enableHdr)) * 31;
            Double d11 = this.bitRateOverride;
            int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
            Double d12 = this.bitRateMultiplier;
            return iHashCode2 + (d12 != null ? d12.hashCode() : 0);
        }

        public String toString() {
            return "Video(isMirrored=" + this.isMirrored + ", enableHdr=" + this.enableHdr + ", bitRateOverride=" + this.bitRateOverride + ", bitRateMultiplier=" + this.bitRateMultiplier + ")";
        }
    }

    public CameraConfiguration() {
        this(null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, BitmapDescriptorFactory.HUE_RED, false, null, 262143, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CameraConfiguration b(CameraConfiguration cameraConfiguration, String str, g gVar, g gVar2, g gVar3, g gVar4, g gVar5, Integer num, Integer num2, boolean z11, fz.j jVar, CameraDeviceFormat cameraDeviceFormat, boolean z12, fz.u uVar, fz.y yVar, Double d11, float f11, boolean z13, g gVar6, int i11, Object obj) {
        g gVar7;
        boolean z14;
        String str2 = (i11 & 1) != 0 ? cameraConfiguration.cameraId : str;
        g gVar8 = (i11 & 2) != 0 ? cameraConfiguration.preview : gVar;
        g gVar9 = (i11 & 4) != 0 ? cameraConfiguration.photo : gVar2;
        g gVar10 = (i11 & 8) != 0 ? cameraConfiguration.video : gVar3;
        g gVar11 = (i11 & 16) != 0 ? cameraConfiguration.frameProcessor : gVar4;
        g gVar12 = (i11 & 32) != 0 ? cameraConfiguration.codeScanner : gVar5;
        Integer num3 = (i11 & 64) != 0 ? cameraConfiguration.minFps : num;
        Integer num4 = (i11 & 128) != 0 ? cameraConfiguration.maxFps : num2;
        boolean z15 = (i11 & 256) != 0 ? cameraConfiguration.enableLocation : z11;
        fz.j jVar2 = (i11 & 512) != 0 ? cameraConfiguration.outputOrientation : jVar;
        CameraDeviceFormat cameraDeviceFormat2 = (i11 & 1024) != 0 ? cameraConfiguration.format : cameraDeviceFormat;
        boolean z16 = (i11 & 2048) != 0 ? cameraConfiguration.enableLowLightBoost : z12;
        fz.u uVar2 = (i11 & 4096) != 0 ? cameraConfiguration.torch : uVar;
        fz.y yVar2 = (i11 & PKIFailureInfo.certRevoked) != 0 ? cameraConfiguration.videoStabilizationMode : yVar;
        String str3 = str2;
        Double d12 = (i11 & 16384) != 0 ? cameraConfiguration.exposure : d11;
        float f12 = (i11 & 32768) != 0 ? cameraConfiguration.zoom : f11;
        boolean z17 = (i11 & 65536) != 0 ? cameraConfiguration.isActive : z13;
        if ((i11 & 131072) != 0) {
            z14 = z17;
            gVar7 = cameraConfiguration.audio;
        } else {
            gVar7 = gVar6;
            z14 = z17;
        }
        return cameraConfiguration.a(str3, gVar8, gVar9, gVar10, gVar11, gVar12, num3, num4, z15, jVar2, cameraDeviceFormat2, z16, uVar2, yVar2, d12, f12, z14, gVar7);
    }

    public final void A(Double d11) {
        this.exposure = d11;
    }

    public final void B(CameraDeviceFormat cameraDeviceFormat) {
        this.format = cameraDeviceFormat;
    }

    public final void C(g<FrameProcessor> gVar) {
        p013kotlin.jvm.internal.s.k(gVar, "<set-?>");
        this.frameProcessor = gVar;
    }

    public final void D(Integer num) {
        this.maxFps = num;
    }

    public final void E(Integer num) {
        this.minFps = num;
    }

    public final void F(fz.j jVar) {
        p013kotlin.jvm.internal.s.k(jVar, "<set-?>");
        this.outputOrientation = jVar;
    }

    public final void G(g<Photo> gVar) {
        p013kotlin.jvm.internal.s.k(gVar, "<set-?>");
        this.photo = gVar;
    }

    public final void H(g<Preview> gVar) {
        p013kotlin.jvm.internal.s.k(gVar, "<set-?>");
        this.preview = gVar;
    }

    public final void I(fz.u uVar) {
        p013kotlin.jvm.internal.s.k(uVar, "<set-?>");
        this.torch = uVar;
    }

    public final void J(g<Video> gVar) {
        p013kotlin.jvm.internal.s.k(gVar, "<set-?>");
        this.video = gVar;
    }

    public final void K(float f11) {
        this.zoom = f11;
    }

    public final CameraConfiguration a(String cameraId, g<Preview> preview, g<Photo> photo, g<Video> video, g<FrameProcessor> frameProcessor, g<CodeScanner> codeScanner, Integer minFps, Integer maxFps, boolean enableLocation, fz.j outputOrientation, CameraDeviceFormat format, boolean enableLowLightBoost, fz.u torch, fz.y videoStabilizationMode, Double exposure, float zoom, boolean isActive, g<Audio> audio) {
        p013kotlin.jvm.internal.s.k(preview, "preview");
        p013kotlin.jvm.internal.s.k(photo, "photo");
        p013kotlin.jvm.internal.s.k(video, "video");
        p013kotlin.jvm.internal.s.k(frameProcessor, "frameProcessor");
        p013kotlin.jvm.internal.s.k(codeScanner, "codeScanner");
        p013kotlin.jvm.internal.s.k(outputOrientation, "outputOrientation");
        p013kotlin.jvm.internal.s.k(torch, "torch");
        p013kotlin.jvm.internal.s.k(videoStabilizationMode, "videoStabilizationMode");
        p013kotlin.jvm.internal.s.k(audio, "audio");
        return new CameraConfiguration(cameraId, preview, photo, video, frameProcessor, codeScanner, minFps, maxFps, enableLocation, outputOrientation, format, enableLowLightBoost, torch, videoStabilizationMode, exposure, zoom, isActive, audio);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCameraId() {
        return this.cameraId;
    }

    public final g<CodeScanner> d() {
        return this.codeScanner;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getEnableLocation() {
        return this.enableLocation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraConfiguration)) {
            return false;
        }
        CameraConfiguration cameraConfiguration = (CameraConfiguration) other;
        return p013kotlin.jvm.internal.s.f(this.cameraId, cameraConfiguration.cameraId) && p013kotlin.jvm.internal.s.f(this.preview, cameraConfiguration.preview) && p013kotlin.jvm.internal.s.f(this.photo, cameraConfiguration.photo) && p013kotlin.jvm.internal.s.f(this.video, cameraConfiguration.video) && p013kotlin.jvm.internal.s.f(this.frameProcessor, cameraConfiguration.frameProcessor) && p013kotlin.jvm.internal.s.f(this.codeScanner, cameraConfiguration.codeScanner) && p013kotlin.jvm.internal.s.f(this.minFps, cameraConfiguration.minFps) && p013kotlin.jvm.internal.s.f(this.maxFps, cameraConfiguration.maxFps) && this.enableLocation == cameraConfiguration.enableLocation && this.outputOrientation == cameraConfiguration.outputOrientation && p013kotlin.jvm.internal.s.f(this.format, cameraConfiguration.format) && this.enableLowLightBoost == cameraConfiguration.enableLowLightBoost && this.torch == cameraConfiguration.torch && this.videoStabilizationMode == cameraConfiguration.videoStabilizationMode && p013kotlin.jvm.internal.s.f(this.exposure, cameraConfiguration.exposure) && Float.compare(this.zoom, cameraConfiguration.zoom) == 0 && this.isActive == cameraConfiguration.isActive && p013kotlin.jvm.internal.s.f(this.audio, cameraConfiguration.audio);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getEnableLowLightBoost() {
        return this.enableLowLightBoost;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getExposure() {
        return this.exposure;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final CameraDeviceFormat getFormat() {
        return this.format;
    }

    public int hashCode() {
        String str = this.cameraId;
        int iHashCode = (((((((((((str == null ? 0 : str.hashCode()) * 31) + this.preview.hashCode()) * 31) + this.photo.hashCode()) * 31) + this.video.hashCode()) * 31) + this.frameProcessor.hashCode()) * 31) + this.codeScanner.hashCode()) * 31;
        Integer num = this.minFps;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxFps;
        int iHashCode3 = (((((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + Boolean.hashCode(this.enableLocation)) * 31) + this.outputOrientation.hashCode()) * 31;
        CameraDeviceFormat cameraDeviceFormat = this.format;
        int iHashCode4 = (((((((iHashCode3 + (cameraDeviceFormat == null ? 0 : cameraDeviceFormat.hashCode())) * 31) + Boolean.hashCode(this.enableLowLightBoost)) * 31) + this.torch.hashCode()) * 31) + this.videoStabilizationMode.hashCode()) * 31;
        Double d11 = this.exposure;
        return ((((((iHashCode4 + (d11 != null ? d11.hashCode() : 0)) * 31) + Float.hashCode(this.zoom)) * 31) + Boolean.hashCode(this.isActive)) * 31) + this.audio.hashCode();
    }

    public final g<FrameProcessor> i() {
        return this.frameProcessor;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getMaxFps() {
        return this.maxFps;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getMinFps() {
        return this.minFps;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final fz.j getOutputOrientation() {
        return this.outputOrientation;
    }

    public final g<Photo> m() {
        return this.photo;
    }

    public final g<Preview> n() {
        return this.preview;
    }

    public final Range<Integer> o() {
        Integer num;
        Integer num2 = this.minFps;
        if (num2 == null || (num = this.maxFps) == null) {
            return null;
        }
        return new Range<>(num2, num);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final fz.u getTorch() {
        return this.torch;
    }

    public final g<Video> q() {
        return this.video;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final fz.y getVideoStabilizationMode() {
        return this.videoStabilizationMode;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final float getZoom() {
        return this.zoom;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public String toString() {
        return "CameraConfiguration(cameraId=" + this.cameraId + ", preview=" + this.preview + ", photo=" + this.photo + ", video=" + this.video + ", frameProcessor=" + this.frameProcessor + ", codeScanner=" + this.codeScanner + ", minFps=" + this.minFps + ", maxFps=" + this.maxFps + ", enableLocation=" + this.enableLocation + ", outputOrientation=" + this.outputOrientation + ", format=" + this.format + ", enableLowLightBoost=" + this.enableLowLightBoost + ", torch=" + this.torch + ", videoStabilizationMode=" + this.videoStabilizationMode + ", exposure=" + this.exposure + ", zoom=" + this.zoom + ", isActive=" + this.isActive + ", audio=" + this.audio + ")";
    }

    public final void u(boolean z11) {
        this.isActive = z11;
    }

    public final void v(g<Audio> gVar) {
        p013kotlin.jvm.internal.s.k(gVar, "<set-?>");
        this.audio = gVar;
    }

    public final void w(String str) {
        this.cameraId = str;
    }

    public final void x(g<CodeScanner> gVar) {
        p013kotlin.jvm.internal.s.k(gVar, "<set-?>");
        this.codeScanner = gVar;
    }

    public final void y(boolean z11) {
        this.enableLocation = z11;
    }

    public final void z(boolean z11) {
        this.enableLowLightBoost = z11;
    }

    public CameraConfiguration(String str, g<Preview> preview, g<Photo> photo, g<Video> video, g<FrameProcessor> frameProcessor, g<CodeScanner> codeScanner, Integer num, Integer num2, boolean z11, fz.j outputOrientation, CameraDeviceFormat cameraDeviceFormat, boolean z12, fz.u torch, fz.y videoStabilizationMode, Double d11, float f11, boolean z13, g<Audio> audio) {
        p013kotlin.jvm.internal.s.k(preview, "preview");
        p013kotlin.jvm.internal.s.k(photo, "photo");
        p013kotlin.jvm.internal.s.k(video, "video");
        p013kotlin.jvm.internal.s.k(frameProcessor, "frameProcessor");
        p013kotlin.jvm.internal.s.k(codeScanner, "codeScanner");
        p013kotlin.jvm.internal.s.k(outputOrientation, "outputOrientation");
        p013kotlin.jvm.internal.s.k(torch, "torch");
        p013kotlin.jvm.internal.s.k(videoStabilizationMode, "videoStabilizationMode");
        p013kotlin.jvm.internal.s.k(audio, "audio");
        this.cameraId = str;
        this.preview = preview;
        this.photo = photo;
        this.video = video;
        this.frameProcessor = frameProcessor;
        this.codeScanner = codeScanner;
        this.minFps = num;
        this.maxFps = num2;
        this.enableLocation = z11;
        this.outputOrientation = outputOrientation;
        this.format = cameraDeviceFormat;
        this.enableLowLightBoost = z12;
        this.torch = torch;
        this.videoStabilizationMode = videoStabilizationMode;
        this.exposure = d11;
        this.zoom = f11;
        this.isActive = z13;
        this.audio = audio;
    }

    public /* synthetic */ CameraConfiguration(String str, g gVar, g gVar2, g gVar3, g gVar4, g gVar5, Integer num, Integer num2, boolean z11, fz.j jVar, CameraDeviceFormat cameraDeviceFormat, boolean z12, fz.u uVar, fz.y yVar, Double d11, float f11, boolean z13, g gVar6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? g.C1248a.INSTANCE.a() : gVar, (i11 & 4) != 0 ? g.C1248a.INSTANCE.a() : gVar2, (i11 & 8) != 0 ? g.C1248a.INSTANCE.a() : gVar3, (i11 & 16) != 0 ? g.C1248a.INSTANCE.a() : gVar4, (i11 & 32) != 0 ? g.C1248a.INSTANCE.a() : gVar5, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? null : num2, (i11 & 256) != 0 ? false : z11, (i11 & 512) != 0 ? fz.j.DEVICE : jVar, (i11 & 1024) != 0 ? null : cameraDeviceFormat, (i11 & 2048) != 0 ? false : z12, (i11 & 4096) != 0 ? fz.u.OFF : uVar, (i11 & PKIFailureInfo.certRevoked) != 0 ? fz.y.OFF : yVar, (i11 & 16384) != 0 ? null : d11, (i11 & 32768) != 0 ? 1.0f : f11, (i11 & 65536) != 0 ? false : z13, (i11 & 131072) != 0 ? g.C1248a.INSTANCE.a() : gVar6);
    }
}
