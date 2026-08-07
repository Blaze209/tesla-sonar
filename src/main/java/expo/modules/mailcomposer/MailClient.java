package expo.modules.mailcomposer;

import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lexpo/modules/mailcomposer/MailClient;", "Lexpo/modules/kotlin/records/Record;", AnnotatedPrivateKey.LABEL, "", "packageName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabel$annotations", "()V", "getLabel", "()Ljava/lang/String;", "getPackageName$annotations", "getPackageName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "expo-mail-composer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MailClient implements Record {
    private final String label;
    private final String packageName;

    public MailClient(String label, String packageName) {
        s.k(label, "label");
        s.k(packageName, "packageName");
        this.label = label;
        this.packageName = packageName;
    }

    public static /* synthetic */ MailClient copy$default(MailClient mailClient, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mailClient.label;
        }
        if ((i11 & 2) != 0) {
            str2 = mailClient.packageName;
        }
        return mailClient.copy(str, str2);
    }

    @Field
    public static /* synthetic */ void getLabel$annotations() {
    }

    @Field
    public static /* synthetic */ void getPackageName$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    public final MailClient copy(String label, String packageName) {
        s.k(label, "label");
        s.k(packageName, "packageName");
        return new MailClient(label, packageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MailClient)) {
            return false;
        }
        MailClient mailClient = (MailClient) other;
        return s.f(this.label, mailClient.label) && s.f(this.packageName, mailClient.packageName);
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.packageName.hashCode();
    }

    public String toString() {
        return "MailClient(label=" + this.label + ", packageName=" + this.packageName + ")";
    }
}
