package com.fourthline.kyc.internal;

import com.fourthline.kyc.Attachment;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Attachment.LocalFileAttachment.MimeType.values().length];
            try {
                iArr[Attachment.LocalFileAttachment.MimeType.PDF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String a(String text) {
        s.k(text, "text");
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < text.length(); i11++) {
            char cCharAt = text.charAt(i11);
            if (cCharAt == '\"') {
                sb2.append("&quot;");
            } else if (cCharAt == '<') {
                sb2.append("&lt;");
            } else if (cCharAt == '>') {
                sb2.append("&gt;");
            } else if (cCharAt == '&') {
                sb2.append("&amp;");
            } else if (cCharAt == '\'') {
                sb2.append("&apos;");
            } else if (cCharAt > '~') {
                sb2.append("&#" + ((int) cCharAt) + ";");
            } else {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        s.j(string, "with(...)");
        return string;
    }

    public static final String a(Attachment.Document document) {
        String strA;
        s.k(document, "<this>");
        Attachment.LocalFileAttachment file = document.getFile();
        return (file == null || (strA = a(file)) == null) ? "jpg" : strA;
    }

    public static final String a(Attachment.LocalFileAttachment localFileAttachment) {
        s.k(localFileAttachment, "<this>");
        if (a.$EnumSwitchMapping$0[localFileAttachment.getMimeType().ordinal()] == 1) {
            return "pdf";
        }
        throw new NoWhenBranchMatchedException();
    }
}
