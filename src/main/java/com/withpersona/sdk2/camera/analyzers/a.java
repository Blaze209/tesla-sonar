package com.withpersona.sdk2.camera.analyzers;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import zf0.ExtractedTexts;
import zf0.ImageIdMetadata;
import zf0.ImageLightCondition;
import zf0.q0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/camera/analyzers/a;", "", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, "a", "c", "f", "e", "b", "Lcom/withpersona/sdk2/camera/analyzers/a$a;", "Lcom/withpersona/sdk2/camera/analyzers/a$b;", "Lcom/withpersona/sdk2/camera/analyzers/a$c;", "Lcom/withpersona/sdk2/camera/analyzers/a$d;", "Lcom/withpersona/sdk2/camera/analyzers/a$e;", "Lcom/withpersona/sdk2/camera/analyzers/a$f;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.analyzers.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/camera/analyzers/a$a;", "Lcom/withpersona/sdk2/camera/analyzers/a;", "Lzf0/g;", "extractedBarcode", "<init>", "(Lzf0/g;)V", "a", "Lzf0/g;", "()Lzf0/g;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1154a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final zf0.g extractedBarcode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1154a(zf0.g extractedBarcode) {
            super(null);
            s.k(extractedBarcode, "extractedBarcode");
            this.extractedBarcode = extractedBarcode;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final zf0.g getExtractedBarcode() {
            return this.extractedBarcode;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/camera/analyzers/a$b;", "Lcom/withpersona/sdk2/camera/analyzers/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f57156a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 801215118;
        }

        public String toString() {
            return "Empty";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/camera/analyzers/a$c;", "Lcom/withpersona/sdk2/camera/analyzers/a;", "Lzf0/q0$c;", "side", "frontOrBackData", "<init>", "(Lzf0/q0$c;Lcom/withpersona/sdk2/camera/analyzers/a;)V", "a", "Lzf0/q0$c;", "b", "()Lzf0/q0$c;", "Lcom/withpersona/sdk2/camera/analyzers/a;", "()Lcom/withpersona/sdk2/camera/analyzers/a;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q0.c side;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final a frontOrBackData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q0.c side, a frontOrBackData) {
            super(null);
            s.k(side, "side");
            s.k(frontOrBackData, "frontOrBackData");
            this.side = side;
            this.frontOrBackData = frontOrBackData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getFrontOrBackData() {
            return this.frontOrBackData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final q0.c getSide() {
            return this.side;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/camera/analyzers/a$d;", "Lcom/withpersona/sdk2/camera/analyzers/a;", "Lzf0/g0;", OrcaKeys.METADATA, "<init>", "(Lzf0/g0;)V", "a", "Lzf0/g0;", "()Lzf0/g0;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ImageIdMetadata metadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ImageIdMetadata metadata) {
            super(null);
            s.k(metadata, "metadata");
            this.metadata = metadata;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ImageIdMetadata getMetadata() {
            return this.metadata;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/camera/analyzers/a$e;", "Lcom/withpersona/sdk2/camera/analyzers/a;", "Lzf0/h0;", "imageLightCondition", "<init>", "(Lzf0/h0;)V", "a", "Lzf0/h0;", "()Lzf0/h0;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ImageLightCondition imageLightCondition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ImageLightCondition imageLightCondition) {
            super(null);
            s.k(imageLightCondition, "imageLightCondition");
            this.imageLightCondition = imageLightCondition;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ImageLightCondition getImageLightCondition() {
            return this.imageLightCondition;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/camera/analyzers/a$f;", "Lcom/withpersona/sdk2/camera/analyzers/a;", "Lzf0/c0;", "extractedTexts", "<init>", "(Lzf0/c0;)V", "a", "Lzf0/c0;", "()Lzf0/c0;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ExtractedTexts extractedTexts;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ExtractedTexts extractedTexts) {
            super(null);
            s.k(extractedTexts, "extractedTexts");
            this.extractedTexts = extractedTexts;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ExtractedTexts getExtractedTexts() {
            return this.extractedTexts;
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
