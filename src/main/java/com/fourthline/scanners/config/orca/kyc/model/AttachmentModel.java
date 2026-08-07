package com.fourthline.scanners.config.orca.kyc.model;

import ch.qos.logback.core.joran.action.Action;
import com.fourthline.core.location.Coordinate;
import com.fourthline.scanners.config.orca.kyc.model.AttachmentModel;
import com.fourthline.scanners.config.orca.kyc.model.serialization.CoordinateSerializer;
import com.fourthline.scanners.config.orca.kyc.model.serialization.UUIDSerializer;
import com.fourthline.scanners.config.orca.kyc.model.serialization.UriSerializer;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.util.List;
import java.util.UUID;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.o;
import ro0.p;
import to0.f;
import vo0.e;
import vo0.s0;
import vo0.v1;
import vo0.z1;
import wn0.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b7\u0018\u0000 22\u00020\u0001:\u000534562B1\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0019\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010 \u0012\u0004\b%\u0010\u001f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010&\u0012\u0004\b+\u0010\u001f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\t\u0010,\u0012\u0004\b1\u0010\u001f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00067"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel;", "", "", "imagePath", "", "timestamp", "Lcom/fourthline/core/location/Coordinate;", "location", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Lcom/fourthline/core/location/Coordinate;Ljava/util/UUID;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Long;Lcom/fourthline/core/location/Coordinate;Ljava/util/UUID;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self", "(Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel;Luo0/d;Lto0/f;)V", "Ljava/lang/String;", "getImagePath", "()Ljava/lang/String;", "setImagePath", "(Ljava/lang/String;)V", "getImagePath$annotations", "()V", "Ljava/lang/Long;", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "getTimestamp$annotations", "Lcom/fourthline/core/location/Coordinate;", "getLocation", "()Lcom/fourthline/core/location/Coordinate;", "setLocation", "(Lcom/fourthline/core/location/Coordinate;)V", "getLocation$annotations", "Ljava/util/UUID;", "getUuid$fourthline_adapters_json_release", "()Ljava/util/UUID;", "setUuid$fourthline_adapters_json_release", "(Ljava/util/UUID;)V", "getUuid$fourthline_adapters_json_release$annotations", "Companion", "Selfie", "Document", "LocalFileAttachmentModel", "Nfc", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public abstract class AttachmentModel {
    private String imagePath;
    private Coordinate location;
    private Long timestamp;
    private UUID uuid;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<d<Object>> $cachedSerializer$delegate = m.a(jn0.p.PUBLICATION, new a() { // from class: sp.a
        @Override // wn0.a
        public final Object invoke() {
            return AttachmentModel._init_$_anonymous_();
        }
    });

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ d get$cachedSerializer() {
            return (d) AttachmentModel.$cachedSerializer$delegate.getValue();
        }

        public final d<AttachmentModel> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IHBO\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JV\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010.\u0012\u0004\b2\u00103\u001a\u0004\b/\u0010\u001d\"\u0004\b0\u00101R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00104\u0012\u0004\b8\u00103\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u00107R*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010.\u0012\u0004\b;\u00103\u001a\u0004\b9\u0010\u001d\"\u0004\b:\u00101R(\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010<\u0012\u0004\b?\u00103\u001a\u0004\b\b\u0010\"\"\u0004\b=\u0010>R*\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010.\u0012\u0004\bB\u00103\u001a\u0004\b@\u0010\u001d\"\u0004\bA\u00101R*\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010C\u0012\u0004\bG\u00103\u001a\u0004\bD\u0010%\"\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Document;", "", "", "image", "Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$LocalFileAttachmentModel;", Action.FILE_ATTRIBUTE, "fileSide", "", "isAngled", "timestamp", "Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;", "location", "<init>", "(Ljava/lang/String;Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$LocalFileAttachmentModel;Ljava/lang/String;ZLjava/lang/String;Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$LocalFileAttachmentModel;Ljava/lang/String;ZLjava/lang/String;Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Document;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$LocalFileAttachmentModel;", "component3", "component4", "()Z", "component5", "component6", "()Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;", "copy", "(Ljava/lang/String;Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$LocalFileAttachmentModel;Ljava/lang/String;ZLjava/lang/String;Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;)Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Document;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "setImage", "(Ljava/lang/String;)V", "getImage$annotations", "()V", "Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$LocalFileAttachmentModel;", "getFile", "setFile", "(Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$LocalFileAttachmentModel;)V", "getFile$annotations", "getFileSide", "setFileSide", "getFileSide$annotations", "Z", "setAngled", "(Z)V", "isAngled$annotations", "getTimestamp", "setTimestamp", "getTimestamp$annotations", "Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;", "getLocation", "setLocation", "(Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;)V", "getLocation$annotations", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @p
    public static final /* data */ class Document {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private LocalFileAttachmentModel file;
        private String fileSide;
        private String image;
        private boolean isAngled;
        private CoordinateModel location;
        private String timestamp;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Document$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Document;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final d<Document> serializer() {
                return AttachmentModel$Document$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Document() {
            this((String) null, (LocalFileAttachmentModel) null, (String) null, false, (String) null, (CoordinateModel) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Document copy$default(Document document, String str, LocalFileAttachmentModel localFileAttachmentModel, String str2, boolean z11, String str3, CoordinateModel coordinateModel, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = document.image;
            }
            if ((i11 & 2) != 0) {
                localFileAttachmentModel = document.file;
            }
            if ((i11 & 4) != 0) {
                str2 = document.fileSide;
            }
            if ((i11 & 8) != 0) {
                z11 = document.isAngled;
            }
            if ((i11 & 16) != 0) {
                str3 = document.timestamp;
            }
            if ((i11 & 32) != 0) {
                coordinateModel = document.location;
            }
            String str4 = str3;
            CoordinateModel coordinateModel2 = coordinateModel;
            return document.copy(str, localFileAttachmentModel, str2, z11, str4, coordinateModel2);
        }

        @o(Action.FILE_ATTRIBUTE)
        public static /* synthetic */ void getFile$annotations() {
        }

        @o("fileSide")
        public static /* synthetic */ void getFileSide$annotations() {
        }

        @o("image")
        public static /* synthetic */ void getImage$annotations() {
        }

        @o("location")
        public static /* synthetic */ void getLocation$annotations() {
        }

        @o("timestamp")
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @o("isAngled")
        public static /* synthetic */ void isAngled$annotations() {
        }

        public static final /* synthetic */ void write$Self$fourthline_adapters_json_release(Document self, uo0.d output, f serialDesc) {
            if (output.G(serialDesc, 0) || self.image != null) {
                output.y(serialDesc, 0, z1.f119730a, self.image);
            }
            if (output.G(serialDesc, 1) || self.file != null) {
                output.y(serialDesc, 1, AttachmentModel$LocalFileAttachmentModel$$serializer.INSTANCE, self.file);
            }
            if (output.G(serialDesc, 2) || self.fileSide != null) {
                output.y(serialDesc, 2, z1.f119730a, self.fileSide);
            }
            if (output.G(serialDesc, 3) || self.isAngled) {
                output.A(serialDesc, 3, self.isAngled);
            }
            if (output.G(serialDesc, 4) || self.timestamp != null) {
                output.y(serialDesc, 4, z1.f119730a, self.timestamp);
            }
            if (!output.G(serialDesc, 5) && self.location == null) {
                return;
            }
            output.y(serialDesc, 5, CoordinateModel$$serializer.INSTANCE, self.location);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final LocalFileAttachmentModel getFile() {
            return this.file;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFileSide() {
            return this.fileSide;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsAngled() {
            return this.isAngled;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final CoordinateModel getLocation() {
            return this.location;
        }

        public final Document copy(String image, LocalFileAttachmentModel file, String fileSide, boolean isAngled, String timestamp, CoordinateModel location) {
            return new Document(image, file, fileSide, isAngled, timestamp, location);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Document)) {
                return false;
            }
            Document document = (Document) other;
            return s.f(this.image, document.image) && s.f(this.file, document.file) && s.f(this.fileSide, document.fileSide) && this.isAngled == document.isAngled && s.f(this.timestamp, document.timestamp) && s.f(this.location, document.location);
        }

        public final LocalFileAttachmentModel getFile() {
            return this.file;
        }

        public final String getFileSide() {
            return this.fileSide;
        }

        public final String getImage() {
            return this.image;
        }

        public final CoordinateModel getLocation() {
            return this.location;
        }

        public final String getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            String str = this.image;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            LocalFileAttachmentModel localFileAttachmentModel = this.file;
            int iHashCode2 = (iHashCode + (localFileAttachmentModel == null ? 0 : localFileAttachmentModel.hashCode())) * 31;
            String str2 = this.fileSide;
            int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isAngled)) * 31;
            String str3 = this.timestamp;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            CoordinateModel coordinateModel = this.location;
            return iHashCode4 + (coordinateModel != null ? coordinateModel.hashCode() : 0);
        }

        public final boolean isAngled() {
            return this.isAngled;
        }

        public final void setAngled(boolean z11) {
            this.isAngled = z11;
        }

        public final void setFile(LocalFileAttachmentModel localFileAttachmentModel) {
            this.file = localFileAttachmentModel;
        }

        public final void setFileSide(String str) {
            this.fileSide = str;
        }

        public final void setImage(String str) {
            this.image = str;
        }

        public final void setLocation(CoordinateModel coordinateModel) {
            this.location = coordinateModel;
        }

        public final void setTimestamp(String str) {
            this.timestamp = str;
        }

        public String toString() {
            return "Document(image=" + this.image + ", file=" + this.file + ", fileSide=" + this.fileSide + ", isAngled=" + this.isAngled + ", timestamp=" + this.timestamp + ", location=" + this.location + ")";
        }

        public Document(String str) {
            this(str, (LocalFileAttachmentModel) null, (String) null, false, (String) null, (CoordinateModel) null, 62, (DefaultConstructorMarker) null);
        }

        public Document(String str, LocalFileAttachmentModel localFileAttachmentModel) {
            this(str, localFileAttachmentModel, (String) null, false, (String) null, (CoordinateModel) null, 60, (DefaultConstructorMarker) null);
        }

        public Document(String str, LocalFileAttachmentModel localFileAttachmentModel, String str2) {
            this(str, localFileAttachmentModel, str2, false, (String) null, (CoordinateModel) null, 56, (DefaultConstructorMarker) null);
        }

        public Document(String str, LocalFileAttachmentModel localFileAttachmentModel, String str2, boolean z11) {
            this(str, localFileAttachmentModel, str2, z11, (String) null, (CoordinateModel) null, 48, (DefaultConstructorMarker) null);
        }

        public Document(String str, LocalFileAttachmentModel localFileAttachmentModel, String str2, boolean z11, String str3) {
            this(str, localFileAttachmentModel, str2, z11, str3, (CoordinateModel) null, 32, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ Document(int i11, String str, LocalFileAttachmentModel localFileAttachmentModel, String str2, boolean z11, String str3, CoordinateModel coordinateModel, v1 v1Var) {
            if ((i11 & 1) == 0) {
                this.image = null;
            } else {
                this.image = str;
            }
            if ((i11 & 2) == 0) {
                this.file = null;
            } else {
                this.file = localFileAttachmentModel;
            }
            if ((i11 & 4) == 0) {
                this.fileSide = null;
            } else {
                this.fileSide = str2;
            }
            if ((i11 & 8) == 0) {
                this.isAngled = false;
            } else {
                this.isAngled = z11;
            }
            if ((i11 & 16) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = str3;
            }
            if ((i11 & 32) == 0) {
                this.location = null;
            } else {
                this.location = coordinateModel;
            }
        }

        public Document(String str, LocalFileAttachmentModel localFileAttachmentModel, String str2, boolean z11, String str3, CoordinateModel coordinateModel) {
            this.image = str;
            this.file = localFileAttachmentModel;
            this.fileSide = str2;
            this.isAngled = z11;
            this.timestamp = str3;
            this.location = coordinateModel;
        }

        public /* synthetic */ Document(String str, LocalFileAttachmentModel localFileAttachmentModel, String str2, boolean z11, String str3, CoordinateModel coordinateModel, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : localFileAttachmentModel, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : coordinateModel);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B!\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010#\u0012\u0004\b'\u0010(\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010&R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010)\u0012\u0004\b-\u0010(\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$LocalFileAttachmentModel;", "", "Ljava/net/URI;", "filePath", "", "mimeType", "<init>", "(Ljava/net/URI;Ljava/lang/String;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/net/URI;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$LocalFileAttachmentModel;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Ljava/net/URI;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/net/URI;Ljava/lang/String;)Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$LocalFileAttachmentModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/net/URI;", "getFilePath", "setFilePath", "(Ljava/net/URI;)V", "getFilePath$annotations", "()V", "Ljava/lang/String;", "getMimeType", "setMimeType", "(Ljava/lang/String;)V", "getMimeType$annotations", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @p
    public static final /* data */ class LocalFileAttachmentModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private URI filePath;
        private String mimeType;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$LocalFileAttachmentModel$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$LocalFileAttachmentModel;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final d<LocalFileAttachmentModel> serializer() {
                return AttachmentModel$LocalFileAttachmentModel$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LocalFileAttachmentModel() {
            this((URI) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ LocalFileAttachmentModel copy$default(LocalFileAttachmentModel localFileAttachmentModel, URI uri, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                uri = localFileAttachmentModel.filePath;
            }
            if ((i11 & 2) != 0) {
                str = localFileAttachmentModel.mimeType;
            }
            return localFileAttachmentModel.copy(uri, str);
        }

        @o("filePath")
        @p(with = UriSerializer.class)
        public static /* synthetic */ void getFilePath$annotations() {
        }

        @o("mimeType")
        public static /* synthetic */ void getMimeType$annotations() {
        }

        public static final /* synthetic */ void write$Self$fourthline_adapters_json_release(LocalFileAttachmentModel self, uo0.d output, f serialDesc) {
            if (output.G(serialDesc, 0) || self.filePath != null) {
                output.y(serialDesc, 0, UriSerializer.INSTANCE, self.filePath);
            }
            if (!output.G(serialDesc, 1) && self.mimeType == null) {
                return;
            }
            output.y(serialDesc, 1, z1.f119730a, self.mimeType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final URI getFilePath() {
            return this.filePath;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        public final LocalFileAttachmentModel copy(URI filePath, String mimeType) {
            return new LocalFileAttachmentModel(filePath, mimeType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocalFileAttachmentModel)) {
                return false;
            }
            LocalFileAttachmentModel localFileAttachmentModel = (LocalFileAttachmentModel) other;
            return s.f(this.filePath, localFileAttachmentModel.filePath) && s.f(this.mimeType, localFileAttachmentModel.mimeType);
        }

        public final URI getFilePath() {
            return this.filePath;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public int hashCode() {
            URI uri = this.filePath;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.mimeType;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final void setFilePath(URI uri) {
            this.filePath = uri;
        }

        public final void setMimeType(String str) {
            this.mimeType = str;
        }

        public String toString() {
            return "LocalFileAttachmentModel(filePath=" + this.filePath + ", mimeType=" + this.mimeType + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LocalFileAttachmentModel(URI uri) {
            this(uri, (String) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public /* synthetic */ LocalFileAttachmentModel(int i11, URI uri, String str, v1 v1Var) {
            if ((i11 & 1) == 0) {
                this.filePath = null;
            } else {
                this.filePath = uri;
            }
            if ((i11 & 2) == 0) {
                this.mimeType = null;
            } else {
                this.mimeType = str;
            }
        }

        public LocalFileAttachmentModel(URI uri, String str) {
            this.filePath = uri;
            this.mimeType = str;
        }

        public /* synthetic */ LocalFileAttachmentModel(URI uri, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uri, (i11 & 2) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@BI\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JP\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010,\u0012\u0004\b0\u00101\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010/R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010,\u0012\u0004\b4\u00101\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010/R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010,\u0012\u0004\b7\u00101\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010/R*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u00108\u0012\u0004\b<\u00101\u001a\u0004\b9\u0010 \"\u0004\b:\u0010;R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010=\u0012\u0004\b?\u00101\u001a\u0004\b>\u0010\"¨\u0006B"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Nfc;", "", "", "image", "mrz", "timestamp", "Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;", "location", "", "Lcom/fourthline/scanners/config/orca/kyc/model/NfcDataGroupModel;", "dataGroups", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;Ljava/util/List;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;Ljava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Nfc;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;Ljava/util/List;)Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Nfc;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "setImage", "(Ljava/lang/String;)V", "getImage$annotations", "()V", "getMrz", "setMrz", "getMrz$annotations", "getTimestamp", "setTimestamp", "getTimestamp$annotations", "Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;", "getLocation", "setLocation", "(Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;)V", "getLocation$annotations", "Ljava/util/List;", "getDataGroups", "getDataGroups$annotations", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @p
    public static final /* data */ class Nfc {
        private final List<NfcDataGroupModel> dataGroups;
        private String image;
        private CoordinateModel location;
        private String mrz;
        private String timestamp;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final d<Object>[] $childSerializers = {null, null, null, null, new e(NfcDataGroupModel$$serializer.INSTANCE)};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Nfc$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Nfc;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final d<Nfc> serializer() {
                return AttachmentModel$Nfc$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Nfc() {
            this((String) null, (String) null, (String) null, (CoordinateModel) null, (List) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Nfc copy$default(Nfc nfc, String str, String str2, String str3, CoordinateModel coordinateModel, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = nfc.image;
            }
            if ((i11 & 2) != 0) {
                str2 = nfc.mrz;
            }
            if ((i11 & 4) != 0) {
                str3 = nfc.timestamp;
            }
            if ((i11 & 8) != 0) {
                coordinateModel = nfc.location;
            }
            if ((i11 & 16) != 0) {
                list = nfc.dataGroups;
            }
            List list2 = list;
            String str4 = str3;
            return nfc.copy(str, str2, str4, coordinateModel, list2);
        }

        @o("dataGroups")
        public static /* synthetic */ void getDataGroups$annotations() {
        }

        @o("image")
        public static /* synthetic */ void getImage$annotations() {
        }

        @o("location")
        public static /* synthetic */ void getLocation$annotations() {
        }

        @o("mrz")
        public static /* synthetic */ void getMrz$annotations() {
        }

        @o("timestamp")
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        public static final /* synthetic */ void write$Self$fourthline_adapters_json_release(Nfc self, uo0.d output, f serialDesc) {
            d<Object>[] dVarArr = $childSerializers;
            if (output.G(serialDesc, 0) || self.image != null) {
                output.y(serialDesc, 0, z1.f119730a, self.image);
            }
            if (output.G(serialDesc, 1) || self.mrz != null) {
                output.y(serialDesc, 1, z1.f119730a, self.mrz);
            }
            if (output.G(serialDesc, 2) || self.timestamp != null) {
                output.y(serialDesc, 2, z1.f119730a, self.timestamp);
            }
            if (output.G(serialDesc, 3) || self.location != null) {
                output.y(serialDesc, 3, CoordinateModel$$serializer.INSTANCE, self.location);
            }
            if (!output.G(serialDesc, 4) && s.f(self.dataGroups, v.m())) {
                return;
            }
            output.D(serialDesc, 4, dVarArr[4], self.dataGroups);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMrz() {
            return this.mrz;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final CoordinateModel getLocation() {
            return this.location;
        }

        public final List<NfcDataGroupModel> component5() {
            return this.dataGroups;
        }

        public final Nfc copy(String image, String mrz, String timestamp, CoordinateModel location, List<NfcDataGroupModel> dataGroups) {
            s.k(dataGroups, "dataGroups");
            return new Nfc(image, mrz, timestamp, location, dataGroups);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Nfc)) {
                return false;
            }
            Nfc nfc = (Nfc) other;
            return s.f(this.image, nfc.image) && s.f(this.mrz, nfc.mrz) && s.f(this.timestamp, nfc.timestamp) && s.f(this.location, nfc.location) && s.f(this.dataGroups, nfc.dataGroups);
        }

        public final List<NfcDataGroupModel> getDataGroups() {
            return this.dataGroups;
        }

        public final String getImage() {
            return this.image;
        }

        public final CoordinateModel getLocation() {
            return this.location;
        }

        public final String getMrz() {
            return this.mrz;
        }

        public final String getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            String str = this.image;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.mrz;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.timestamp;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            CoordinateModel coordinateModel = this.location;
            return ((iHashCode3 + (coordinateModel != null ? coordinateModel.hashCode() : 0)) * 31) + this.dataGroups.hashCode();
        }

        public final void setImage(String str) {
            this.image = str;
        }

        public final void setLocation(CoordinateModel coordinateModel) {
            this.location = coordinateModel;
        }

        public final void setMrz(String str) {
            this.mrz = str;
        }

        public final void setTimestamp(String str) {
            this.timestamp = str;
        }

        public String toString() {
            return "Nfc(image=" + this.image + ", mrz=" + this.mrz + ", timestamp=" + this.timestamp + ", location=" + this.location + ", dataGroups=" + this.dataGroups + ")";
        }

        public Nfc(String str) {
            this(str, (String) null, (String) null, (CoordinateModel) null, (List) null, 30, (DefaultConstructorMarker) null);
        }

        public Nfc(String str, String str2) {
            this(str, str2, (String) null, (CoordinateModel) null, (List) null, 28, (DefaultConstructorMarker) null);
        }

        public Nfc(String str, String str2, String str3) {
            this(str, str2, str3, (CoordinateModel) null, (List) null, 24, (DefaultConstructorMarker) null);
        }

        public Nfc(String str, String str2, String str3, CoordinateModel coordinateModel) {
            this(str, str2, str3, coordinateModel, (List) null, 16, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ Nfc(int i11, String str, String str2, String str3, CoordinateModel coordinateModel, List list, v1 v1Var) {
            if ((i11 & 1) == 0) {
                this.image = null;
            } else {
                this.image = str;
            }
            if ((i11 & 2) == 0) {
                this.mrz = null;
            } else {
                this.mrz = str2;
            }
            if ((i11 & 4) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = str3;
            }
            if ((i11 & 8) == 0) {
                this.location = null;
            } else {
                this.location = coordinateModel;
            }
            if ((i11 & 16) == 0) {
                this.dataGroups = v.m();
            } else {
                this.dataGroups = list;
            }
        }

        public Nfc(String str, String str2, String str3, CoordinateModel coordinateModel, List<NfcDataGroupModel> dataGroups) {
            s.k(dataGroups, "dataGroups");
            this.image = str;
            this.mrz = str2;
            this.timestamp = str3;
            this.location = coordinateModel;
            this.dataGroups = dataGroups;
        }

        public /* synthetic */ Nfc(String str, String str2, String str3, CoordinateModel coordinateModel, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : coordinateModel, (i11 & 16) != 0 ? v.m() : list);
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBC\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010$\u001a\u00020\tHÀ\u0003¢\u0006\u0004\b\"\u0010#JJ\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010.\u0012\u0004\b2\u00103\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u00101R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010.\u0012\u0004\b6\u00103\u001a\u0004\b4\u0010\u001c\"\u0004\b5\u00101R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00107\u0012\u0004\b;\u00103\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010:R*\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010<\u0012\u0004\b@\u00103\u001a\u0004\b=\u0010!\"\u0004\b>\u0010?R \u0010\n\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\n\u0010A\u0012\u0004\bC\u00103\u001a\u0004\bB\u0010#¨\u0006F"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Selfie;", "", "", "image", "timestamp", "Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;", "location", "Lcom/fourthline/scanners/config/orca/kyc/model/VideoRecordingModel;", "videoRecording", "Ljava/util/UUID;", "videoUUID", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;Lcom/fourthline/scanners/config/orca/kyc/model/VideoRecordingModel;Ljava/util/UUID;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;Lcom/fourthline/scanners/config/orca/kyc/model/VideoRecordingModel;Ljava/util/UUID;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Selfie;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;", "component4", "()Lcom/fourthline/scanners/config/orca/kyc/model/VideoRecordingModel;", "component5$fourthline_adapters_json_release", "()Ljava/util/UUID;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;Lcom/fourthline/scanners/config/orca/kyc/model/VideoRecordingModel;Ljava/util/UUID;)Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Selfie;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "setImage", "(Ljava/lang/String;)V", "getImage$annotations", "()V", "getTimestamp", "setTimestamp", "getTimestamp$annotations", "Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;", "getLocation", "setLocation", "(Lcom/fourthline/scanners/config/orca/kyc/model/CoordinateModel;)V", "getLocation$annotations", "Lcom/fourthline/scanners/config/orca/kyc/model/VideoRecordingModel;", "getVideoRecording", "setVideoRecording", "(Lcom/fourthline/scanners/config/orca/kyc/model/VideoRecordingModel;)V", "getVideoRecording$annotations", "Ljava/util/UUID;", "getVideoUUID$fourthline_adapters_json_release", "getVideoUUID$fourthline_adapters_json_release$annotations", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @p
    public static final /* data */ class Selfie {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String image;
        private CoordinateModel location;
        private String timestamp;
        private VideoRecordingModel videoRecording;
        private final UUID videoUUID;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Selfie$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Selfie;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final d<Selfie> serializer() {
                return AttachmentModel$Selfie$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Selfie() {
            this((String) null, (String) null, (CoordinateModel) null, (VideoRecordingModel) null, (UUID) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Selfie copy$default(Selfie selfie, String str, String str2, CoordinateModel coordinateModel, VideoRecordingModel videoRecordingModel, UUID uuid, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = selfie.image;
            }
            if ((i11 & 2) != 0) {
                str2 = selfie.timestamp;
            }
            if ((i11 & 4) != 0) {
                coordinateModel = selfie.location;
            }
            if ((i11 & 8) != 0) {
                videoRecordingModel = selfie.videoRecording;
            }
            if ((i11 & 16) != 0) {
                uuid = selfie.videoUUID;
            }
            UUID uuid2 = uuid;
            CoordinateModel coordinateModel2 = coordinateModel;
            return selfie.copy(str, str2, coordinateModel2, videoRecordingModel, uuid2);
        }

        @o("image")
        public static /* synthetic */ void getImage$annotations() {
        }

        @o("location")
        public static /* synthetic */ void getLocation$annotations() {
        }

        @o("timestamp")
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @o("videoRecording")
        public static /* synthetic */ void getVideoRecording$annotations() {
        }

        @o("videoUUID")
        @p(with = UUIDSerializer.class)
        public static /* synthetic */ void getVideoUUID$fourthline_adapters_json_release$annotations() {
        }

        public static final /* synthetic */ void write$Self$fourthline_adapters_json_release(Selfie self, uo0.d output, f serialDesc) {
            if (output.G(serialDesc, 0) || self.image != null) {
                output.y(serialDesc, 0, z1.f119730a, self.image);
            }
            if (output.G(serialDesc, 1) || self.timestamp != null) {
                output.y(serialDesc, 1, z1.f119730a, self.timestamp);
            }
            if (output.G(serialDesc, 2) || self.location != null) {
                output.y(serialDesc, 2, CoordinateModel$$serializer.INSTANCE, self.location);
            }
            if (output.G(serialDesc, 3) || self.videoRecording != null) {
                output.y(serialDesc, 3, VideoRecordingModel$$serializer.INSTANCE, self.videoRecording);
            }
            if (!output.G(serialDesc, 4) && s.f(self.videoUUID, UUID.randomUUID())) {
                return;
            }
            output.D(serialDesc, 4, UUIDSerializer.INSTANCE, self.videoUUID);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final CoordinateModel getLocation() {
            return this.location;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final VideoRecordingModel getVideoRecording() {
            return this.videoRecording;
        }

        /* JADX INFO: renamed from: component5$fourthline_adapters_json_release, reason: from getter */
        public final UUID getVideoUUID() {
            return this.videoUUID;
        }

        public final Selfie copy(String image, String timestamp, CoordinateModel location, VideoRecordingModel videoRecording, UUID videoUUID) {
            s.k(videoUUID, "videoUUID");
            return new Selfie(image, timestamp, location, videoRecording, videoUUID);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Selfie)) {
                return false;
            }
            Selfie selfie = (Selfie) other;
            return s.f(this.image, selfie.image) && s.f(this.timestamp, selfie.timestamp) && s.f(this.location, selfie.location) && s.f(this.videoRecording, selfie.videoRecording) && s.f(this.videoUUID, selfie.videoUUID);
        }

        public final String getImage() {
            return this.image;
        }

        public final CoordinateModel getLocation() {
            return this.location;
        }

        public final String getTimestamp() {
            return this.timestamp;
        }

        public final VideoRecordingModel getVideoRecording() {
            return this.videoRecording;
        }

        public final UUID getVideoUUID$fourthline_adapters_json_release() {
            return this.videoUUID;
        }

        public int hashCode() {
            String str = this.image;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.timestamp;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            CoordinateModel coordinateModel = this.location;
            int iHashCode3 = (iHashCode2 + (coordinateModel == null ? 0 : coordinateModel.hashCode())) * 31;
            VideoRecordingModel videoRecordingModel = this.videoRecording;
            return ((iHashCode3 + (videoRecordingModel != null ? videoRecordingModel.hashCode() : 0)) * 31) + this.videoUUID.hashCode();
        }

        public final void setImage(String str) {
            this.image = str;
        }

        public final void setLocation(CoordinateModel coordinateModel) {
            this.location = coordinateModel;
        }

        public final void setTimestamp(String str) {
            this.timestamp = str;
        }

        public final void setVideoRecording(VideoRecordingModel videoRecordingModel) {
            this.videoRecording = videoRecordingModel;
        }

        public String toString() {
            return "Selfie(image=" + this.image + ", timestamp=" + this.timestamp + ", location=" + this.location + ", videoRecording=" + this.videoRecording + ", videoUUID=" + this.videoUUID + ")";
        }

        public Selfie(String str) {
            this(str, (String) null, (CoordinateModel) null, (VideoRecordingModel) null, (UUID) null, 30, (DefaultConstructorMarker) null);
        }

        public Selfie(String str, String str2) {
            this(str, str2, (CoordinateModel) null, (VideoRecordingModel) null, (UUID) null, 28, (DefaultConstructorMarker) null);
        }

        public Selfie(String str, String str2, CoordinateModel coordinateModel) {
            this(str, str2, coordinateModel, (VideoRecordingModel) null, (UUID) null, 24, (DefaultConstructorMarker) null);
        }

        public Selfie(String str, String str2, CoordinateModel coordinateModel, VideoRecordingModel videoRecordingModel) {
            this(str, str2, coordinateModel, videoRecordingModel, (UUID) null, 16, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ Selfie(int i11, String str, String str2, CoordinateModel coordinateModel, VideoRecordingModel videoRecordingModel, UUID uuid, v1 v1Var) {
            if ((i11 & 1) == 0) {
                this.image = null;
            } else {
                this.image = str;
            }
            if ((i11 & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = str2;
            }
            if ((i11 & 4) == 0) {
                this.location = null;
            } else {
                this.location = coordinateModel;
            }
            if ((i11 & 8) == 0) {
                this.videoRecording = null;
            } else {
                this.videoRecording = videoRecordingModel;
            }
            if ((i11 & 16) == 0) {
                this.videoUUID = UUID.randomUUID();
            } else {
                this.videoUUID = uuid;
            }
        }

        public Selfie(String str, String str2, CoordinateModel coordinateModel, VideoRecordingModel videoRecordingModel, UUID videoUUID) {
            s.k(videoUUID, "videoUUID");
            this.image = str;
            this.timestamp = str2;
            this.location = coordinateModel;
            this.videoRecording = videoRecordingModel;
            this.videoUUID = videoUUID;
        }

        public /* synthetic */ Selfie(String str, String str2, CoordinateModel coordinateModel, VideoRecordingModel videoRecordingModel, UUID uuid, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : coordinateModel, (i11 & 8) != 0 ? null : videoRecordingModel, (i11 & 16) != 0 ? UUID.randomUUID() : uuid);
        }
    }

    public /* synthetic */ AttachmentModel(String str, Long l11, Coordinate coordinate, UUID uuid, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l11, coordinate, uuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ d _init_$_anonymous_() {
        return new ro0.m("com.fourthline.scanners.config.orca.kyc.model.AttachmentModel", o0.b(AttachmentModel.class), new co0.d[0], new d[0], new Annotation[0]);
    }

    @o("imagePath")
    public static /* synthetic */ void getImagePath$annotations() {
    }

    @o("location")
    @p(with = CoordinateSerializer.class)
    public static /* synthetic */ void getLocation$annotations() {
    }

    @o("timestamp")
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    @o("uuid")
    @p(with = UUIDSerializer.class)
    public static /* synthetic */ void getUuid$fourthline_adapters_json_release$annotations() {
    }

    public static final /* synthetic */ void write$Self(AttachmentModel self, uo0.d output, f serialDesc) {
        output.y(serialDesc, 0, z1.f119730a, self.getImagePath());
        output.y(serialDesc, 1, s0.f119686a, self.getTimestamp());
        output.y(serialDesc, 2, CoordinateSerializer.INSTANCE, self.getLocation());
        if (!output.G(serialDesc, 3) && s.f(self.uuid, UUID.randomUUID())) {
            return;
        }
        output.D(serialDesc, 3, UUIDSerializer.INSTANCE, self.uuid);
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public Coordinate getLocation() {
        return this.location;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: getUuid$fourthline_adapters_json_release, reason: from getter */
    public final UUID getUuid() {
        return this.uuid;
    }

    public void setImagePath(String str) {
        this.imagePath = str;
    }

    public void setLocation(Coordinate coordinate) {
        this.location = coordinate;
    }

    public void setTimestamp(Long l11) {
        this.timestamp = l11;
    }

    public final void setUuid$fourthline_adapters_json_release(UUID uuid) {
        s.k(uuid, "<set-?>");
        this.uuid = uuid;
    }

    public /* synthetic */ AttachmentModel(int i11, String str, Long l11, Coordinate coordinate, UUID uuid, v1 v1Var) {
        this.imagePath = str;
        this.timestamp = l11;
        this.location = coordinate;
        if ((i11 & 8) == 0) {
            this.uuid = UUID.randomUUID();
        } else {
            this.uuid = uuid;
        }
    }

    private AttachmentModel(String str, Long l11, Coordinate coordinate, UUID uuid) {
        this.imagePath = str;
        this.timestamp = l11;
        this.location = coordinate;
        this.uuid = uuid;
    }

    public /* synthetic */ AttachmentModel(String str, Long l11, Coordinate coordinate, UUID uuid, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l11, coordinate, (i11 & 8) != 0 ? UUID.randomUUID() : uuid, null);
    }
}
