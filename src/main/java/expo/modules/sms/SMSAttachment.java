package expo.modules.sms;

import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lexpo/modules/sms/SMSAttachment;", "Lexpo/modules/kotlin/records/Record;", "uri", "", "mimeType", "filename", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUri$annotations", "()V", "getUri", "()Ljava/lang/String;", "getMimeType$annotations", "getMimeType", "getFilename$annotations", "getFilename", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "expo-sms_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SMSAttachment implements Record {
    private final String filename;
    private final String mimeType;
    private final String uri;

    public SMSAttachment(String uri, String mimeType, String filename) {
        s.k(uri, "uri");
        s.k(mimeType, "mimeType");
        s.k(filename, "filename");
        this.uri = uri;
        this.mimeType = mimeType;
        this.filename = filename;
    }

    public static /* synthetic */ SMSAttachment copy$default(SMSAttachment sMSAttachment, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sMSAttachment.uri;
        }
        if ((i11 & 2) != 0) {
            str2 = sMSAttachment.mimeType;
        }
        if ((i11 & 4) != 0) {
            str3 = sMSAttachment.filename;
        }
        return sMSAttachment.copy(str, str2, str3);
    }

    @Field
    public static /* synthetic */ void getFilename$annotations() {
    }

    @Field
    public static /* synthetic */ void getMimeType$annotations() {
    }

    @Field
    public static /* synthetic */ void getUri$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    public final SMSAttachment copy(String uri, String mimeType, String filename) {
        s.k(uri, "uri");
        s.k(mimeType, "mimeType");
        s.k(filename, "filename");
        return new SMSAttachment(uri, mimeType, filename);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SMSAttachment)) {
            return false;
        }
        SMSAttachment sMSAttachment = (SMSAttachment) other;
        return s.f(this.uri, sMSAttachment.uri) && s.f(this.mimeType, sMSAttachment.mimeType) && s.f(this.filename, sMSAttachment.filename);
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (((this.uri.hashCode() * 31) + this.mimeType.hashCode()) * 31) + this.filename.hashCode();
    }

    public String toString() {
        return "SMSAttachment(uri=" + this.uri + ", mimeType=" + this.mimeType + ", filename=" + this.filename + ")";
    }
}
