package expo.modules.mailcomposer;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.util.Log;
import androidx.core.content.FileProvider;
import ch.qos.logback.core.joran.action.Action;
import ezvcard.property.Kind;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010\u000e\u001a\u00020\u0007J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011J\u0016\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lexpo/modules/mailcomposer/MailIntentBuilder;", "", "options", "Lexpo/modules/mailcomposer/MailComposerOptions;", "<init>", "(Lexpo/modules/mailcomposer/MailComposerOptions;)V", "mailIntent", "Landroid/content/Intent;", "contentUriFromFile", "Landroid/net/Uri;", Action.FILE_ATTRIBUTE, "Ljava/io/File;", Kind.APPLICATION, "Landroid/app/Application;", "build", "setComponentName", "pkg", "", "cls", "putRecipients", "intentName", "putCcRecipients", "putBccRecipients", "putSubject", "putBody", "isBodyHtml", "", "putAttachments", "expo-mail-composer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MailIntentBuilder {
    private final Intent mailIntent;
    private final MailComposerOptions options;

    public MailIntentBuilder(MailComposerOptions options) {
        s.k(options, "options");
        this.options = options;
        this.mailIntent = new Intent("android.intent.action.SEND_MULTIPLE");
    }

    private final Uri contentUriFromFile(File file, Application application) {
        try {
            return FileProvider.getUriForFile(application, application.getPackageName() + ".MailComposerFileProvider", file);
        } catch (Exception unused) {
            return Uri.fromFile(file);
        }
    }

    /* JADX INFO: renamed from: build, reason: from getter */
    public final Intent getMailIntent() {
        return this.mailIntent;
    }

    public final MailIntentBuilder putAttachments(String intentName, Application application) {
        s.k(intentName, "intentName");
        s.k(application, "application");
        try {
            List<String> attachments = this.options.getAttachments();
            if (attachments != null) {
                Object[] array = attachments.toArray(new String[0]);
                ArrayList arrayList = new ArrayList(array.length);
                for (Object obj : array) {
                    String path = Uri.parse((String) obj).getPath();
                    if (path == null) {
                        throw new IllegalArgumentException("Path to attachment can not be null");
                    }
                    arrayList.add(contentUriFromFile(new File(path), application));
                }
                this.mailIntent.putParcelableArrayListExtra(intentName, (ArrayList) v.h1(arrayList, new ArrayList()));
            }
            return this;
        } catch (IllegalArgumentException e11) {
            Log.e("ExpoMailComposer", "Illegal argument:", e11);
            return this;
        }
    }

    public final MailIntentBuilder putBccRecipients(String intentName) {
        s.k(intentName, "intentName");
        List<String> bccRecipients = this.options.getBccRecipients();
        if (bccRecipients != null) {
            this.mailIntent.putExtra(intentName, (String[]) bccRecipients.toArray(new String[0]));
        }
        return this;
    }

    public final MailIntentBuilder putBody(String intentName, boolean isBodyHtml) {
        s.k(intentName, "intentName");
        if (this.options.getBody() != null) {
            this.mailIntent.putExtra(intentName, isBodyHtml ? Html.fromHtml(this.options.getBody(), 63) : this.options.getBody());
        }
        return this;
    }

    public final MailIntentBuilder putCcRecipients(String intentName) {
        s.k(intentName, "intentName");
        List<String> ccRecipients = this.options.getCcRecipients();
        if (ccRecipients != null) {
            this.mailIntent.putExtra(intentName, (String[]) ccRecipients.toArray(new String[0]));
        }
        return this;
    }

    public final MailIntentBuilder putRecipients(String intentName) {
        s.k(intentName, "intentName");
        List<String> recipients = this.options.getRecipients();
        if (recipients != null) {
            this.mailIntent.putExtra(intentName, (String[]) recipients.toArray(new String[0]));
        }
        return this;
    }

    public final MailIntentBuilder putSubject(String intentName) {
        s.k(intentName, "intentName");
        String subject = this.options.getSubject();
        if (subject != null) {
            this.mailIntent.putExtra(intentName, subject);
        }
        return this;
    }

    public final MailIntentBuilder setComponentName(String pkg, String cls) {
        s.k(pkg, "pkg");
        s.k(cls, "cls");
        this.mailIntent.setComponent(new ComponentName(pkg, cls));
        return this;
    }
}
