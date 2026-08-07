package com.withpersona.sdk2.inquiry.internal.network;

import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.x;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@com.squareup.moshi.i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Data;", "data", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;", "meta", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Data;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Data;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Data;", "b", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;", "Data", "Meta", "Attributes", "GpsCollectionRequirement", "GpsPrecisionRequirement", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateInquirySessionResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Data data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Meta meta;

    @com.squareup.moshi.i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Attributes;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;", "gpsCollectionRequirement", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;", "gpsPrecisionRequirement", "", "playIntegrityProjectId", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;Ljava/lang/String;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;", "b", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Attributes {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final GpsCollectionRequirement gpsCollectionRequirement;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final GpsPrecisionRequirement gpsPrecisionRequirement;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String playIntegrityProjectId;

        public Attributes() {
            this(null, null, null, 7, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final GpsCollectionRequirement getGpsCollectionRequirement() {
            return this.gpsCollectionRequirement;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final GpsPrecisionRequirement getGpsPrecisionRequirement() {
            return this.gpsPrecisionRequirement;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPlayIntegrityProjectId() {
            return this.playIntegrityProjectId;
        }

        public Attributes(GpsCollectionRequirement gpsCollectionRequirement, GpsPrecisionRequirement gpsPrecisionRequirement, String str) {
            this.gpsCollectionRequirement = gpsCollectionRequirement;
            this.gpsPrecisionRequirement = gpsPrecisionRequirement;
            this.playIntegrityProjectId = str;
        }

        public /* synthetic */ Attributes(GpsCollectionRequirement gpsCollectionRequirement, GpsPrecisionRequirement gpsPrecisionRequirement, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : gpsCollectionRequirement, (i11 & 2) != 0 ? null : gpsPrecisionRequirement, (i11 & 4) != 0 ? null : str);
        }
    }

    @com.squareup.moshi.i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Data;", "", "", "id", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Attributes;", "attributes", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Attributes;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Attributes;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Attributes;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Attributes attributes;

        public Data(String id2, Attributes attributes) {
            s.k(id2, "id");
            s.k(attributes, "attributes");
            this.id = id2;
            this.attributes = attributes;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Attributes getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }
    }

    @com.squareup.moshi.i(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;", "", "<init>", "(Ljava/lang/String;I)V", "REQUIRE", "OPTIONAL", "NONE", "Companion", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum GpsCollectionRequirement {
        REQUIRE,
        OPTIONAL,
        NONE;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement$Companion;", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;", "<init>", "()V", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;", "Lcom/squareup/moshi/r;", "writer", "value", "Ljn0/h0;", "toJson", "(Lcom/squareup/moshi/r;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;)V", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion extends com.squareup.moshi.h<GpsCollectionRequirement> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // com.squareup.moshi.h
            @x
            public void toJson(r writer, GpsCollectionRequirement value) {
                s.k(writer, "writer");
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.moshi.h
            @com.squareup.moshi.f
            public GpsCollectionRequirement fromJson(k reader) {
                s.k(reader, "reader");
                Object objJ = reader.J();
                if (s.f(objJ, "require")) {
                    return GpsCollectionRequirement.REQUIRE;
                }
                return s.f(objJ, "optional") ? GpsCollectionRequirement.OPTIONAL : GpsCollectionRequirement.NONE;
            }
        }

        public static EnumEntries<GpsCollectionRequirement> getEntries() {
            return $ENTRIES;
        }
    }

    @com.squareup.moshi.i(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;", "", "<init>", "(Ljava/lang/String;I)V", "ROUGH", "PRECISE", "Companion", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum GpsPrecisionRequirement {
        ROUGH,
        PRECISE;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement$Companion;", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;", "<init>", "()V", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;", "Lcom/squareup/moshi/r;", "writer", "value", "Ljn0/h0;", "toJson", "(Lcom/squareup/moshi/r;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;)V", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion extends com.squareup.moshi.h<GpsPrecisionRequirement> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // com.squareup.moshi.h
            @x
            public void toJson(r writer, GpsPrecisionRequirement value) {
                s.k(writer, "writer");
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.moshi.h
            @com.squareup.moshi.f
            public GpsPrecisionRequirement fromJson(k reader) {
                s.k(reader, "reader");
                return s.f(reader.J(), "rough") ? GpsPrecisionRequirement.ROUGH : GpsPrecisionRequirement.PRECISE;
            }
        }

        public static EnumEntries<GpsPrecisionRequirement> getEntries() {
            return $ENTRIES;
        }
    }

    @com.squareup.moshi.i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;", "", "", "accessToken", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Meta {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String accessToken;

        public Meta(String accessToken) {
            s.k(accessToken, "accessToken");
            this.accessToken = accessToken;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }
    }

    public CreateInquirySessionResponse(Data data, Meta meta) {
        s.k(data, "data");
        s.k(meta, "meta");
        this.data = data;
        this.meta = meta;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }
}
