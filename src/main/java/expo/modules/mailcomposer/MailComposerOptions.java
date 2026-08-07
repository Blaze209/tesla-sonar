package expo.modules.mailcomposer;

import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003Jz\u0010'\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0004HÖ\u0001R$\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R$\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0018R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001d\u0012\u0004\b\u001b\u0010\u000f\u001a\u0004\b\t\u0010\u001cR$\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011¨\u0006/"}, d2 = {"Lexpo/modules/mailcomposer/MailComposerOptions;", "Lexpo/modules/kotlin/records/Record;", "recipients", "", "", "ccRecipients", "bccRecipients", "subject", "body", "isHtml", "", "attachments", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "getRecipients$annotations", "()V", "getRecipients", "()Ljava/util/List;", "getCcRecipients$annotations", "getCcRecipients", "getBccRecipients$annotations", "getBccRecipients", "getSubject$annotations", "getSubject", "()Ljava/lang/String;", "getBody$annotations", "getBody", "isHtml$annotations", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAttachments$annotations", "getAttachments", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lexpo/modules/mailcomposer/MailComposerOptions;", "equals", "other", "", "hashCode", "", "toString", "expo-mail-composer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MailComposerOptions implements Record {
    private final List<String> attachments;
    private final List<String> bccRecipients;
    private final String body;
    private final List<String> ccRecipients;
    private final Boolean isHtml;
    private final List<String> recipients;
    private final String subject;

    public MailComposerOptions(List<String> list, List<String> list2, List<String> list3, String str, String str2, Boolean bool, List<String> list4) {
        this.recipients = list;
        this.ccRecipients = list2;
        this.bccRecipients = list3;
        this.subject = str;
        this.body = str2;
        this.isHtml = bool;
        this.attachments = list4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MailComposerOptions copy$default(MailComposerOptions mailComposerOptions, List list, List list2, List list3, String str, String str2, Boolean bool, List list4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = mailComposerOptions.recipients;
        }
        if ((i11 & 2) != 0) {
            list2 = mailComposerOptions.ccRecipients;
        }
        if ((i11 & 4) != 0) {
            list3 = mailComposerOptions.bccRecipients;
        }
        if ((i11 & 8) != 0) {
            str = mailComposerOptions.subject;
        }
        if ((i11 & 16) != 0) {
            str2 = mailComposerOptions.body;
        }
        if ((i11 & 32) != 0) {
            bool = mailComposerOptions.isHtml;
        }
        if ((i11 & 64) != 0) {
            list4 = mailComposerOptions.attachments;
        }
        Boolean bool2 = bool;
        List list5 = list4;
        String str3 = str2;
        List list6 = list3;
        return mailComposerOptions.copy(list, list2, list6, str, str3, bool2, list5);
    }

    @Field
    public static /* synthetic */ void getAttachments$annotations() {
    }

    @Field
    public static /* synthetic */ void getBccRecipients$annotations() {
    }

    @Field
    public static /* synthetic */ void getBody$annotations() {
    }

    @Field
    public static /* synthetic */ void getCcRecipients$annotations() {
    }

    @Field
    public static /* synthetic */ void getRecipients$annotations() {
    }

    @Field
    public static /* synthetic */ void getSubject$annotations() {
    }

    @Field
    public static /* synthetic */ void isHtml$annotations() {
    }

    public final List<String> component1() {
        return this.recipients;
    }

    public final List<String> component2() {
        return this.ccRecipients;
    }

    public final List<String> component3() {
        return this.bccRecipients;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsHtml() {
        return this.isHtml;
    }

    public final List<String> component7() {
        return this.attachments;
    }

    public final MailComposerOptions copy(List<String> recipients, List<String> ccRecipients, List<String> bccRecipients, String subject, String body, Boolean isHtml, List<String> attachments) {
        return new MailComposerOptions(recipients, ccRecipients, bccRecipients, subject, body, isHtml, attachments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MailComposerOptions)) {
            return false;
        }
        MailComposerOptions mailComposerOptions = (MailComposerOptions) other;
        return s.f(this.recipients, mailComposerOptions.recipients) && s.f(this.ccRecipients, mailComposerOptions.ccRecipients) && s.f(this.bccRecipients, mailComposerOptions.bccRecipients) && s.f(this.subject, mailComposerOptions.subject) && s.f(this.body, mailComposerOptions.body) && s.f(this.isHtml, mailComposerOptions.isHtml) && s.f(this.attachments, mailComposerOptions.attachments);
    }

    public final List<String> getAttachments() {
        return this.attachments;
    }

    public final List<String> getBccRecipients() {
        return this.bccRecipients;
    }

    public final String getBody() {
        return this.body;
    }

    public final List<String> getCcRecipients() {
        return this.ccRecipients;
    }

    public final List<String> getRecipients() {
        return this.recipients;
    }

    public final String getSubject() {
        return this.subject;
    }

    public int hashCode() {
        List<String> list = this.recipients;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.ccRecipients;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.bccRecipients;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.subject;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.body;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isHtml;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list4 = this.attachments;
        return iHashCode6 + (list4 != null ? list4.hashCode() : 0);
    }

    public final Boolean isHtml() {
        return this.isHtml;
    }

    public String toString() {
        return "MailComposerOptions(recipients=" + this.recipients + ", ccRecipients=" + this.ccRecipients + ", bccRecipients=" + this.bccRecipients + ", subject=" + this.subject + ", body=" + this.body + ", isHtml=" + this.isHtml + ", attachments=" + this.attachments + ")";
    }
}
