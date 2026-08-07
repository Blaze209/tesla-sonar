package expo.modules.contacts;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import expo.modules.contacts.models.BaseModel;
import expo.modules.contacts.models.DateModel;
import expo.modules.contacts.models.DateModelKt;
import expo.modules.contacts.models.EmailModel;
import expo.modules.contacts.models.ExtraNameModel;
import expo.modules.contacts.models.ImAddressModel;
import expo.modules.contacts.models.PhoneNumberModel;
import expo.modules.contacts.models.PostalAddressModel;
import expo.modules.contacts.models.RelationshipModel;
import expo.modules.contacts.models.UrlAddressModel;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.Exceptions;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import jn0.h0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u001d\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u001ej\b\u0012\u0004\u0012\u00020\u000f`\u001f¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u001ej\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f`\u001f¢\u0006\u0004\b\"\u0010!J\u001b\u0010&\u001a\u00020%2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010+R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010(R$\u00102\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010(\u001a\u0004\b3\u0010\u001b\"\u0004\b4\u0010+R\u0018\u00105\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010(R\"\u00107\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010(\u001a\u0004\b=\u0010\u001b\"\u0004\b>\u0010+R\u0018\u0010?\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010(R\u0016\u0010@\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010(R$\u0010A\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010(\u001a\u0004\bB\u0010\u001b\"\u0004\bC\u0010+R$\u0010D\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010(\u001a\u0004\bE\u0010\u001b\"\u0004\bF\u0010+R$\u0010G\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010(\u001a\u0004\bH\u0010\u001b\"\u0004\bI\u0010+R$\u0010J\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010(\u001a\u0004\bK\u0010\u001b\"\u0004\bL\u0010+R$\u0010M\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010(\u001a\u0004\bN\u0010\u001b\"\u0004\bO\u0010+R$\u0010P\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010(\u001a\u0004\bQ\u0010\u001b\"\u0004\bR\u0010+R$\u0010S\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010(\u001a\u0004\bT\u0010\u001b\"\u0004\bU\u0010+R$\u0010V\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010(\u001a\u0004\bW\u0010\u001b\"\u0004\bX\u0010+R$\u0010Y\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010(\u001a\u0004\bZ\u0010\u001b\"\u0004\b[\u0010+R$\u0010\\\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010(\u001a\u0004\b]\u0010\u001b\"\u0004\b^\u0010+R$\u0010_\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010(\u001a\u0004\b`\u0010\u001b\"\u0004\ba\u0010+R$\u0010b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010(\u001a\u0004\bc\u0010\u001b\"\u0004\bd\u0010+R(\u0010g\u001a\b\u0012\u0004\u0012\u00020f0e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR(\u0010n\u001a\b\u0012\u0004\u0012\u00020m0e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010h\u001a\u0004\bo\u0010j\"\u0004\bp\u0010lR(\u0010r\u001a\b\u0012\u0004\u0012\u00020q0e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010h\u001a\u0004\bs\u0010j\"\u0004\bt\u0010lR(\u0010v\u001a\b\u0012\u0004\u0012\u00020u0e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010h\u001a\u0004\bw\u0010j\"\u0004\bx\u0010lR(\u0010z\u001a\b\u0012\u0004\u0012\u00020y0e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010h\u001a\u0004\b{\u0010j\"\u0004\b|\u0010lR)\u0010~\u001a\b\u0012\u0004\u0012\u00020}0e8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010h\u001a\u0004\b\u007f\u0010j\"\u0005\b\u0080\u0001\u0010lR-\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010h\u001a\u0005\b\u0083\u0001\u0010j\"\u0005\b\u0084\u0001\u0010lR-\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010h\u001a\u0005\b\u0087\u0001\u0010j\"\u0005\b\u0088\u0001\u0010lR&\u0010\u0089\u0001\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u00108\u001a\u0005\b\u0089\u0001\u0010:\"\u0005\b\u008a\u0001\u0010<R&\u0010\u0090\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u008d\u00010\u008c\u00010\u008b\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001e\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u008b\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R%\u0010\u0096\u0001\u001a\u0014\u0012\u0005\u0012\u00030\u0094\u00010\u001ej\t\u0012\u0005\u0012\u00030\u0094\u0001`\u001f8F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010!¨\u0006\u0097\u0001"}, d2 = {"Lexpo/modules/contacts/Contact;", "", "", "contactId", "Lexpo/modules/kotlin/AppContext;", "appContext", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/AppContext;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "toByteArray", "(Landroid/graphics/Bitmap;)[B", CMSAttributeTableGenerator.CONTENT_TYPE, "rawId", "Landroid/content/ContentProviderOperation;", "getFlushOperation", "(Ljava/lang/String;Ljava/lang/String;)Landroid/content/ContentProviderOperation;", "photoUri", "getThumbnailBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "Landroid/database/Cursor;", "cursor", "Ljn0/h0;", "fromCursor", "(Landroid/database/Cursor;)V", "getFinalFirstName", "()Ljava/lang/String;", "getFinalLastName", "getFinalDisplayName", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "toInsertOperationList", "()Ljava/util/ArrayList;", "toUpdateOperationList", "", "fieldSet", "Landroid/os/Bundle;", "toMap", "(Ljava/util/Set;)Landroid/os/Bundle;", "Ljava/lang/String;", "getContactId", "setContactId", "(Ljava/lang/String;)V", "Lexpo/modules/kotlin/AppContext;", "getAppContext", "()Lexpo/modules/kotlin/AppContext;", "setAppContext", "(Lexpo/modules/kotlin/AppContext;)V", "rawContactId", "lookupKey", "getLookupKey", "setLookupKey", "displayName", "", "hasPhoto", "Z", "getHasPhoto", "()Z", "setHasPhoto", "(Z)V", "getPhotoUri", "setPhotoUri", "rawPhotoUri", "contactType", EContextPaymentMethod.FIRST_NAME, "getFirstName", "setFirstName", "middleName", "getMiddleName", "setMiddleName", EContextPaymentMethod.LAST_NAME, "getLastName", "setLastName", "prefix", "getPrefix", "setPrefix", "suffix", "getSuffix", "setSuffix", "phoneticFirstName", "getPhoneticFirstName", "setPhoneticFirstName", "phoneticMiddleName", "getPhoneticMiddleName", "setPhoneticMiddleName", "phoneticLastName", "getPhoneticLastName", "setPhoneticLastName", "company", "getCompany", "setCompany", "department", "getDepartment", "setDepartment", "jobTitle", "getJobTitle", "setJobTitle", "note", "getNote", "setNote", "", "Lexpo/modules/contacts/models/DateModel;", "dates", "Ljava/util/List;", "getDates", "()Ljava/util/List;", "setDates", "(Ljava/util/List;)V", "Lexpo/modules/contacts/models/EmailModel;", "emails", "getEmails", "setEmails", "Lexpo/modules/contacts/models/ImAddressModel;", "imAddresses", "getImAddresses", "setImAddresses", "Lexpo/modules/contacts/models/PhoneNumberModel;", "phones", "getPhones", "setPhones", "Lexpo/modules/contacts/models/PostalAddressModel;", "addresses", "getAddresses", "setAddresses", "Lexpo/modules/contacts/models/RelationshipModel;", "relationships", "getRelationships", "setRelationships", "Lexpo/modules/contacts/models/UrlAddressModel;", "urlAddresses", "getUrlAddresses", "setUrlAddresses", "Lexpo/modules/contacts/models/ExtraNameModel;", "extraNames", "getExtraNames", "setExtraNames", "isFavorite", "setFavorite", "", "", "Lexpo/modules/contacts/models/BaseModel;", "getBaseModels", "()[Ljava/util/List;", "baseModels", "getBaseModelsContentType", "()[Ljava/lang/String;", "baseModelsContentType", "Landroid/content/ContentValues;", "getContentValues", "contentValues", "expo-contacts_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Contact {
    private List<PostalAddressModel> addresses;
    private AppContext appContext;
    private String company;
    private String contactId;
    private String contactType;
    private List<DateModel> dates;
    private String department;
    private String displayName;
    private List<EmailModel> emails;
    private List<ExtraNameModel> extraNames;
    private String firstName;
    private boolean hasPhoto;
    private List<ImAddressModel> imAddresses;
    private boolean isFavorite;
    private String jobTitle;
    private String lastName;
    private String lookupKey;
    private String middleName;
    private String note;
    private List<PhoneNumberModel> phones;
    private String phoneticFirstName;
    private String phoneticLastName;
    private String phoneticMiddleName;
    private String photoUri;
    private String prefix;
    private String rawContactId;
    private String rawPhotoUri;
    private List<RelationshipModel> relationships;
    private String suffix;
    private List<UrlAddressModel> urlAddresses;

    public Contact(String contactId, AppContext appContext) {
        s.k(contactId, "contactId");
        s.k(appContext, "appContext");
        this.contactId = contactId;
        this.appContext = appContext;
        this.contactType = "person";
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
        this.prefix = "";
        this.suffix = "";
        this.phoneticFirstName = "";
        this.phoneticMiddleName = "";
        this.phoneticLastName = "";
        this.company = "";
        this.department = "";
        this.jobTitle = "";
        this.dates = new ArrayList();
        this.emails = new ArrayList();
        this.imAddresses = new ArrayList();
        this.phones = new ArrayList();
        this.addresses = new ArrayList();
        this.relationships = new ArrayList();
        this.urlAddresses = new ArrayList();
        this.extraNames = new ArrayList();
    }

    private final List<BaseModel>[] getBaseModels() {
        return new List[]{this.dates, this.emails, this.imAddresses, this.phones, this.addresses, this.relationships, this.urlAddresses, this.extraNames};
    }

    private final String[] getBaseModelsContentType() {
        return new String[]{"vnd.android.cursor.item/contact_event", "vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/im", "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/postal-address_v2", "vnd.android.cursor.item/relation", "vnd.android.cursor.item/website", "vnd.android.cursor.item/nickname"};
    }

    private final ContentProviderOperation getFlushOperation(String contentType, String rawId) {
        ContentProviderOperation contentProviderOperationBuild = ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("mimetype=? AND raw_contact_id=?", new String[]{contentType, rawId}).build();
        s.j(contentProviderOperationBuild, "build(...)");
        return contentProviderOperationBuild;
    }

    private final Bitmap getThumbnailBitmap(String photoUri) throws Exceptions.ReactContextLost, FileNotFoundException {
        Context reactContext = this.appContext.getReactContext();
        if (reactContext == null) {
            throw new Exceptions.ReactContextLost();
        }
        InputStream inputStreamOpenInputStream = reactContext.getContentResolver().openInputStream(Uri.parse(photoUri));
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
            s.j(bitmapDecodeStream, "decodeStream(...)");
            sn0.b.a(inputStreamOpenInputStream, null);
            return bitmapDecodeStream;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(inputStreamOpenInputStream, th2);
                throw th3;
            }
        }
    }

    private final byte[] toByteArray(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        s.j(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void fromCursor(Cursor cursor) {
        s.k(cursor, "cursor");
        this.rawContactId = cursor.getString(cursor.getColumnIndexOrThrow("raw_contact_id"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow(Columns.MIMETYPE));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DISPLAY_NAME));
        boolean z11 = false;
        this.isFavorite = cursor.getInt(cursor.getColumnIndexOrThrow(Columns.STARRED)) == 1;
        if (!TextUtils.isEmpty(string2) && TextUtils.isEmpty(this.displayName)) {
            this.displayName = string2;
        }
        if (TextUtils.isEmpty(this.rawPhotoUri)) {
            String string3 = cursor.getString(cursor.getColumnIndexOrThrow(Columns.PHOTO_URI));
            if (!TextUtils.isEmpty(string3)) {
                this.hasPhoto = true;
                this.rawPhotoUri = string3;
            }
        }
        if (TextUtils.isEmpty(this.photoUri)) {
            String string4 = cursor.getString(cursor.getColumnIndexOrThrow(Columns.PHOTO_THUMBNAIL_URI));
            if (!TextUtils.isEmpty(string4)) {
                this.hasPhoto = true;
                this.photoUri = string4;
            }
        }
        if (string != null) {
            switch (string.hashCode()) {
                case -1569536764:
                    if (string.equals("vnd.android.cursor.item/email_v2")) {
                        EmailModel emailModel = new EmailModel();
                        emailModel.fromCursor(cursor);
                        this.emails.add(emailModel);
                    }
                    break;
                case -1328682538:
                    if (string.equals("vnd.android.cursor.item/contact_event")) {
                        DateModel dateModel = new DateModel();
                        dateModel.fromCursor(cursor);
                        this.dates.add(dateModel);
                    }
                    break;
                case -1079224304:
                    if (string.equals("vnd.android.cursor.item/name")) {
                        this.lookupKey = cursor.getString(cursor.getColumnIndexOrThrow(Columns.LOOKUP_KEY));
                        this.firstName = cursor.getString(cursor.getColumnIndexOrThrow(Columns.TYPE));
                        this.middleName = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_5));
                        this.lastName = cursor.getString(cursor.getColumnIndexOrThrow(Columns.LABEL));
                        this.prefix = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_4));
                        this.suffix = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_6));
                        this.phoneticFirstName = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_7));
                        this.phoneticMiddleName = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_8));
                        this.phoneticLastName = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_9));
                    }
                    break;
                case -1079210633:
                    if (string.equals("vnd.android.cursor.item/note")) {
                        this.note = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA));
                    }
                    break;
                case -601229436:
                    if (string.equals("vnd.android.cursor.item/postal-address_v2")) {
                        PostalAddressModel postalAddressModel = new PostalAddressModel();
                        postalAddressModel.fromCursor(cursor);
                        this.addresses.add(postalAddressModel);
                    }
                    break;
                case 456415478:
                    if (string.equals("vnd.android.cursor.item/website")) {
                        UrlAddressModel urlAddressModel = new UrlAddressModel();
                        urlAddressModel.fromCursor(cursor);
                        this.urlAddresses.add(urlAddressModel);
                    }
                    break;
                case 684173810:
                    if (string.equals("vnd.android.cursor.item/phone_v2")) {
                        PhoneNumberModel phoneNumberModel = new PhoneNumberModel();
                        phoneNumberModel.fromCursor(cursor);
                        this.phones.add(phoneNumberModel);
                    }
                    break;
                case 689862072:
                    if (string.equals("vnd.android.cursor.item/organization")) {
                        this.company = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA));
                        this.jobTitle = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_4));
                        this.department = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_5));
                    }
                    break;
                case 950831081:
                    if (string.equals("vnd.android.cursor.item/im")) {
                        ImAddressModel imAddressModel = new ImAddressModel();
                        imAddressModel.fromCursor(cursor);
                        this.imAddresses.add(imAddressModel);
                    }
                    break;
                case 1409846529:
                    if (string.equals("vnd.android.cursor.item/relation")) {
                        RelationshipModel relationshipModel = new RelationshipModel();
                        relationshipModel.fromCursor(cursor);
                        this.relationships.add(relationshipModel);
                    }
                    break;
                case 2034973555:
                    if (string.equals("vnd.android.cursor.item/nickname")) {
                        ExtraNameModel extraNameModel = new ExtraNameModel();
                        extraNameModel.fromCursor(cursor);
                        this.extraNames.add(extraNameModel);
                    }
                    break;
            }
        }
        String str = this.company;
        String str2 = "person";
        if (str != null && !s.f(str, "")) {
            String str3 = this.firstName;
            boolean z12 = (str3 == null || s.f(str3, "")) ? false : true;
            String str4 = this.middleName;
            boolean z13 = (str4 == null || s.f(str4, "")) ? false : true;
            String str5 = this.lastName;
            if (str5 != null && !s.f(str5, "")) {
                z11 = true;
            }
            if (!z12 && !z13 && !z11) {
                str2 = "company";
            }
        }
        this.contactType = str2;
    }

    public final List<PostalAddressModel> getAddresses() {
        return this.addresses;
    }

    public final AppContext getAppContext() {
        return this.appContext;
    }

    public final String getCompany() {
        return this.company;
    }

    public final String getContactId() {
        return this.contactId;
    }

    public final ArrayList<ContentValues> getContentValues() throws Exceptions.ReactContextLost, FileNotFoundException {
        ArrayList<ContentValues> arrayList = new ArrayList<>();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Columns.MIMETYPE, "vnd.android.cursor.item/identity");
        contentValues.put(Columns.TYPE, this.firstName);
        contentValues.put(Columns.DATA_5, this.middleName);
        contentValues.put(Columns.LABEL, this.lastName);
        contentValues.put(Columns.DATA_4, this.prefix);
        contentValues.put(Columns.DATA_6, this.suffix);
        contentValues.put(Columns.DATA_7, this.phoneticFirstName);
        contentValues.put(Columns.DATA_8, this.phoneticMiddleName);
        contentValues.put(Columns.DATA_9, this.phoneticLastName);
        arrayList.add(contentValues);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(Columns.MIMETYPE, "vnd.android.cursor.item/organization");
        contentValues2.put(Columns.DATA, this.company);
        contentValues2.put(Columns.DATA_4, this.jobTitle);
        contentValues2.put(Columns.DATA_5, this.department);
        arrayList.add(contentValues2);
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put(Columns.MIMETYPE, "vnd.android.cursor.item/note");
        contentValues3.put(Columns.DATA, this.note);
        arrayList.add(contentValues3);
        String str = this.photoUri;
        if (str != null && !t.y0(str)) {
            Bitmap thumbnailBitmap = getThumbnailBitmap(Uri.parse(this.photoUri).getPath());
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put(Columns.MIMETYPE, "vnd.android.cursor.item/photo");
            contentValues4.put("data15", toByteArray(thumbnailBitmap));
            arrayList.add(contentValues4);
        }
        String str2 = this.rawPhotoUri;
        if (str2 != null && !t.y0(str2)) {
            Bitmap thumbnailBitmap2 = getThumbnailBitmap(this.rawPhotoUri);
            ContentValues contentValues5 = new ContentValues();
            contentValues5.put(Columns.MIMETYPE, "vnd.android.cursor.item/photo");
            contentValues5.put("data15", toByteArray(thumbnailBitmap2));
            arrayList.add(contentValues5);
        }
        ContentValues contentValues6 = new ContentValues();
        contentValues6.put("isFavorite", Integer.valueOf(this.isFavorite ? 1 : 0));
        arrayList.add(contentValues6);
        for (List<BaseModel> list : getBaseModels()) {
            Iterator<BaseModel> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getContentValues());
            }
        }
        return arrayList;
    }

    public final List<DateModel> getDates() {
        return this.dates;
    }

    public final String getDepartment() {
        return this.department;
    }

    public final List<EmailModel> getEmails() {
        return this.emails;
    }

    public final List<ExtraNameModel> getExtraNames() {
        return this.extraNames;
    }

    public final String getFinalDisplayName() {
        String str;
        String str2 = this.displayName;
        if (str2 != null || (str = this.firstName) == null) {
            return str2;
        }
        String str3 = this.lastName;
        if (str3 == null) {
            return str;
        }
        t0 t0Var = t0.f86535a;
        String str4 = String.format("%s %s", Arrays.copyOf(new Object[]{str, str3}, 2));
        s.j(str4, "format(...)");
        int length = str4.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            boolean z12 = s.m(str4.charAt(!z11 ? i11 : length), 32) <= 0;
            if (z11) {
                if (!z12) {
                    break;
                }
                length--;
            } else if (z12) {
                i11++;
            } else {
                z11 = true;
            }
        }
        return str4.subSequence(i11, length + 1).toString();
    }

    public final String getFinalFirstName() {
        String str = this.firstName;
        if (str == null) {
            str = this.displayName;
            if (str == null) {
                return "";
            }
            s.h(str);
        }
        return str;
    }

    public final String getFinalLastName() {
        String str = this.lastName;
        if (str == null) {
            str = this.displayName;
            if (str == null) {
                return "";
            }
            s.h(str);
        }
        return str;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final boolean getHasPhoto() {
        return this.hasPhoto;
    }

    public final List<ImAddressModel> getImAddresses() {
        return this.imAddresses;
    }

    public final String getJobTitle() {
        return this.jobTitle;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLookupKey() {
        return this.lookupKey;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getNote() {
        return this.note;
    }

    public final List<PhoneNumberModel> getPhones() {
        return this.phones;
    }

    public final String getPhoneticFirstName() {
        return this.phoneticFirstName;
    }

    public final String getPhoneticLastName() {
        return this.phoneticLastName;
    }

    public final String getPhoneticMiddleName() {
        return this.phoneticMiddleName;
    }

    public final String getPhotoUri() {
        return this.photoUri;
    }

    public final String getPrefix() {
        return this.prefix;
    }

    public final List<RelationshipModel> getRelationships() {
        return this.relationships;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final List<UrlAddressModel> getUrlAddresses() {
        return this.urlAddresses;
    }

    /* JADX INFO: renamed from: isFavorite, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    public final void setAddresses(List<PostalAddressModel> list) {
        s.k(list, "<set-?>");
        this.addresses = list;
    }

    public final void setAppContext(AppContext appContext) {
        s.k(appContext, "<set-?>");
        this.appContext = appContext;
    }

    public final void setCompany(String str) {
        this.company = str;
    }

    public final void setContactId(String str) {
        s.k(str, "<set-?>");
        this.contactId = str;
    }

    public final void setDates(List<DateModel> list) {
        s.k(list, "<set-?>");
        this.dates = list;
    }

    public final void setDepartment(String str) {
        this.department = str;
    }

    public final void setEmails(List<EmailModel> list) {
        s.k(list, "<set-?>");
        this.emails = list;
    }

    public final void setExtraNames(List<ExtraNameModel> list) {
        s.k(list, "<set-?>");
        this.extraNames = list;
    }

    public final void setFavorite(boolean z11) {
        this.isFavorite = z11;
    }

    public final void setFirstName(String str) {
        this.firstName = str;
    }

    public final void setHasPhoto(boolean z11) {
        this.hasPhoto = z11;
    }

    public final void setImAddresses(List<ImAddressModel> list) {
        s.k(list, "<set-?>");
        this.imAddresses = list;
    }

    public final void setJobTitle(String str) {
        this.jobTitle = str;
    }

    public final void setLastName(String str) {
        this.lastName = str;
    }

    public final void setLookupKey(String str) {
        this.lookupKey = str;
    }

    public final void setMiddleName(String str) {
        this.middleName = str;
    }

    public final void setNote(String str) {
        this.note = str;
    }

    public final void setPhones(List<PhoneNumberModel> list) {
        s.k(list, "<set-?>");
        this.phones = list;
    }

    public final void setPhoneticFirstName(String str) {
        this.phoneticFirstName = str;
    }

    public final void setPhoneticLastName(String str) {
        this.phoneticLastName = str;
    }

    public final void setPhoneticMiddleName(String str) {
        this.phoneticMiddleName = str;
    }

    public final void setPhotoUri(String str) {
        this.photoUri = str;
    }

    public final void setPrefix(String str) {
        this.prefix = str;
    }

    public final void setRelationships(List<RelationshipModel> list) {
        s.k(list, "<set-?>");
        this.relationships = list;
    }

    public final void setSuffix(String str) {
        this.suffix = str;
    }

    public final void setUrlAddresses(List<UrlAddressModel> list) {
        s.k(list, "<set-?>");
        this.urlAddresses = list;
    }

    public final ArrayList<ContentProviderOperation> toInsertOperationList() {
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        ContentProviderOperation.Builder builderWithValue = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", null).withValue("account_name", null).withValue(Columns.STARRED, Boolean.valueOf(this.isFavorite));
        s.j(builderWithValue, "withValue(...)");
        arrayList.add(builderWithValue.build());
        Uri uri = ContactsContract.Data.CONTENT_URI;
        arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/name").withValue(Columns.DATA, this.displayName).withValue(Columns.TYPE, this.firstName).withValue(Columns.DATA_5, this.middleName).withValue(Columns.LABEL, this.lastName).withValue(Columns.DATA_7, this.phoneticFirstName).withValue(Columns.DATA_8, this.phoneticMiddleName).withValue(Columns.DATA_9, this.phoneticLastName).withValue(Columns.DATA_4, this.prefix).withValue(Columns.DATA_6, this.suffix).build());
        arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/organization").withValue(Columns.DATA, this.company).withValue(Columns.DATA_4, this.jobTitle).withValue(Columns.DATA_5, this.department).build());
        ContentProviderOperation.Builder builderWithValue2 = ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/note").withValue(Columns.DATA, this.note);
        arrayList.add(builderWithValue2.build());
        builderWithValue2.withYieldAllowed(true);
        if (!TextUtils.isEmpty(this.photoUri) || !TextUtils.isEmpty(this.rawPhotoUri)) {
            arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/photo").withValue("data15", toByteArray(getThumbnailBitmap(TextUtils.isEmpty(this.rawPhotoUri) ? this.photoUri : this.rawPhotoUri))).build());
        }
        for (List<BaseModel> list : getBaseModels()) {
            Iterator<BaseModel> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getInsertOperation());
            }
        }
        return arrayList;
    }

    public final Bundle toMap(Set<String> fieldSet) {
        s.k(fieldSet, "fieldSet");
        Bundle bundle = new Bundle();
        bundle.putString("lookupKey", this.lookupKey);
        bundle.putString("id", this.contactId);
        String str = this.displayName;
        bundle.putString("name", (str == null || str.length() == 0) ? this.firstName + " " + this.lastName : this.displayName);
        String str2 = this.firstName;
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                bundle.putString(EContextPaymentMethod.FIRST_NAME, str2);
                h0 h0Var = h0.f84049a;
            }
        }
        String str3 = this.middleName;
        if (str3 != null) {
            if (str3.length() <= 0) {
                str3 = null;
            }
            if (str3 != null) {
                bundle.putString("middleName", str3);
                h0 h0Var2 = h0.f84049a;
            }
        }
        String str4 = this.lastName;
        if (str4 != null) {
            if (str4.length() <= 0) {
                str4 = null;
            }
            if (str4 != null) {
                bundle.putString(EContextPaymentMethod.LAST_NAME, str4);
                h0 h0Var3 = h0.f84049a;
            }
        }
        String str5 = this.suffix;
        if (str5 != null) {
            if (str5.length() <= 0) {
                str5 = null;
            }
            if (str5 != null) {
                bundle.putString("nameSuffix", str5);
                h0 h0Var4 = h0.f84049a;
            }
        }
        String str6 = this.prefix;
        if (str6 != null) {
            if (str6.length() <= 0) {
                str6 = null;
            }
            if (str6 != null) {
                bundle.putString("namePrefix", str6);
                h0 h0Var5 = h0.f84049a;
            }
        }
        String str7 = this.phoneticFirstName;
        if (str7 != null) {
            if (str7.length() <= 0) {
                str7 = null;
            }
            if (str7 != null) {
                bundle.putString("phoneticFirstName", str7);
                h0 h0Var6 = h0.f84049a;
            }
        }
        String str8 = this.phoneticLastName;
        if (str8 != null) {
            if (str8.length() <= 0) {
                str8 = null;
            }
            if (str8 != null) {
                bundle.putString("phoneticLastName", str8);
                h0 h0Var7 = h0.f84049a;
            }
        }
        String str9 = this.phoneticMiddleName;
        if (str9 != null) {
            if (str9.length() <= 0) {
                str9 = null;
            }
            if (str9 != null) {
                bundle.putString("phoneticMiddleName", str9);
                h0 h0Var8 = h0.f84049a;
            }
        }
        bundle.putString("contactType", this.contactType);
        String str10 = this.company;
        if (str10 != null) {
            if (str10.length() <= 0) {
                str10 = null;
            }
            if (str10 != null) {
                bundle.putString("company", str10);
                h0 h0Var9 = h0.f84049a;
            }
        }
        String str11 = this.jobTitle;
        if (str11 != null) {
            if (str11.length() <= 0) {
                str11 = null;
            }
            if (str11 != null) {
                bundle.putString("jobTitle", str11);
                h0 h0Var10 = h0.f84049a;
            }
        }
        String str12 = this.department;
        if (str12 != null) {
            if (str12.length() <= 0) {
                str12 = null;
            }
            if (str12 != null) {
                bundle.putString("department", str12);
                h0 h0Var11 = h0.f84049a;
            }
        }
        bundle.putBoolean("imageAvailable", this.hasPhoto);
        bundle.putBoolean("isFavorite", this.isFavorite);
        if (fieldSet.contains("image") && this.photoUri != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("uri", this.photoUri);
            h0 h0Var12 = h0.f84049a;
            bundle.putBundle("image", bundle2);
        }
        if (fieldSet.contains("rawImage") && this.rawPhotoUri != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("uri", this.rawPhotoUri);
            h0 h0Var13 = h0.f84049a;
            bundle.putBundle("image", bundle3);
        }
        if (fieldSet.contains("note") && !TextUtils.isEmpty(this.note)) {
            bundle.putString("note", this.note);
        }
        if (fieldSet.contains("phoneNumbers") && this.phones.size() > 0) {
            List<PhoneNumberModel> list = this.phones;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((PhoneNumberModel) it.next()).getMap());
            }
            bundle.putParcelableArrayList("phoneNumbers", new ArrayList<>(arrayList));
        }
        if (fieldSet.contains("emails") && this.emails.size() > 0) {
            List<EmailModel> list2 = this.emails;
            ArrayList arrayList2 = new ArrayList(v.y(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((EmailModel) it2.next()).getMap());
            }
            bundle.putParcelableArrayList("emails", new ArrayList<>(arrayList2));
        }
        if (fieldSet.contains("addresses") && this.addresses.size() > 0) {
            List<PostalAddressModel> list3 = this.addresses;
            ArrayList arrayList3 = new ArrayList(v.y(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((PostalAddressModel) it3.next()).getMap());
            }
            bundle.putParcelableArrayList("addresses", new ArrayList<>(arrayList3));
        }
        if (fieldSet.contains("instantMessageAddresses") && this.imAddresses.size() > 0) {
            List<ImAddressModel> list4 = this.imAddresses;
            ArrayList arrayList4 = new ArrayList(v.y(list4, 10));
            Iterator<T> it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((ImAddressModel) it4.next()).getMap());
            }
            bundle.putParcelableArrayList("instantMessageAddresses", new ArrayList<>(arrayList4));
        }
        if (fieldSet.contains("urlAddresses") && this.urlAddresses.size() > 0) {
            List<UrlAddressModel> list5 = this.urlAddresses;
            ArrayList arrayList5 = new ArrayList(v.y(list5, 10));
            Iterator<T> it5 = list5.iterator();
            while (it5.hasNext()) {
                arrayList5.add(((UrlAddressModel) it5.next()).getMap());
            }
            bundle.putParcelableArrayList("urlAddresses", new ArrayList<>(arrayList5));
        }
        if (fieldSet.contains("relationships") && this.relationships.size() > 0) {
            List<RelationshipModel> list6 = this.relationships;
            ArrayList arrayList6 = new ArrayList(v.y(list6, 10));
            Iterator<T> it6 = list6.iterator();
            while (it6.hasNext()) {
                arrayList6.add(((RelationshipModel) it6.next()).getMap());
            }
            bundle.putParcelableArrayList("relationships", new ArrayList<>(arrayList6));
        }
        boolean z11 = false;
        if (this.extraNames.size() > 0) {
            boolean zContains = fieldSet.contains("nickname");
            boolean zContains2 = fieldSet.contains("maidenName");
            int size = this.extraNames.size();
            for (int i11 = 0; i11 < size; i11++) {
                ExtraNameModel extraNameModel = this.extraNames.get(i11);
                String data = extraNameModel.getData();
                String label = extraNameModel.getLabel();
                if (zContains2 && label != null && s.f(label, "maidenName") && !TextUtils.isEmpty(data)) {
                    bundle.putString(label, data);
                }
                if (zContains && label != null && s.f(label, "nickname") && !TextUtils.isEmpty(data)) {
                    bundle.putString(label, data);
                }
            }
        }
        boolean zContains3 = fieldSet.contains(DateModelKt.BIRTHDAY);
        boolean zContains4 = fieldSet.contains("dates");
        if (zContains4 || zContains3) {
            ArrayList<? extends Parcelable> arrayList7 = new ArrayList<>();
            ArrayList<? extends Parcelable> arrayList8 = new ArrayList<>();
            for (DateModel dateModel : this.dates) {
                Calendar calendar = Calendar.getInstance();
                Bundle bundle4 = new Bundle();
                String data2 = dateModel.getData();
                String label2 = dateModel.getLabel();
                Bundle bundle5 = new Bundle();
                bundle5.putString("type", label2);
                bundle5.putString("value", data2);
                arrayList7.add(bundle5);
                try {
                    s.h(data2);
                    boolean zB0 = t.b0(data2, "--", z11, 2, null);
                    if (zB0) {
                        Date date = new SimpleDateFormat("--MM-dd", Locale.US).parse(data2);
                        s.h(date);
                        calendar.setTime(date);
                    } else {
                        Date date2 = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(data2);
                        s.h(date2);
                        calendar.setTime(date2);
                    }
                    if (!zB0) {
                        bundle4.putInt("year", calendar.get(1));
                    }
                    bundle4.putInt("month", calendar.get(2));
                    bundle4.putInt("day", calendar.get(5));
                    bundle4.putString("format", "gregorian");
                    if (zContains3 && label2 != null && s.f(label2, DateModelKt.BIRTHDAY)) {
                        bundle.putBundle(DateModelKt.BIRTHDAY, bundle4);
                        h0 h0Var14 = h0.f84049a;
                    } else {
                        bundle4.putString(AnnotatedPrivateKey.LABEL, label2);
                        arrayList8.add(bundle4);
                    }
                } catch (Exception e11) {
                    Log.w("Contact", e11.toString());
                }
                z11 = false;
            }
            if (zContains4 && arrayList8.size() > 0) {
                bundle.putParcelableArrayList("dates", arrayList8);
            }
            if (arrayList7.size() > 0) {
                bundle.putParcelableArrayList("rawDates", arrayList7);
            }
        }
        return bundle;
    }

    public final ArrayList<ContentProviderOperation> toUpdateOperationList() throws Exceptions.ReactContextLost, FileNotFoundException {
        t0 t0Var = t0.f86535a;
        String str = String.format("%s=? AND %s=?", Arrays.copyOf(new Object[]{Columns.CONTACT_ID, Columns.MIMETYPE}, 2));
        s.j(str, "format(...)");
        String[] strArr = {this.contactId, "vnd.android.cursor.item/name"};
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        Uri uri = ContactsContract.Data.CONTENT_URI;
        ContentProviderOperation.Builder builderWithValue = ContentProviderOperation.newUpdate(uri).withSelection(str, strArr).withValue(Columns.DATA, this.displayName).withValue(Columns.TYPE, this.firstName).withValue(Columns.DATA_5, this.middleName).withValue(Columns.LABEL, this.lastName).withValue(Columns.DATA_7, this.phoneticFirstName).withValue(Columns.DATA_8, this.phoneticMiddleName).withValue(Columns.DATA_9, this.phoneticLastName).withValue(Columns.DATA_4, this.prefix).withValue(Columns.DATA_6, this.suffix);
        s.j(builderWithValue, "withValue(...)");
        arrayList.add(builderWithValue.build());
        arrayList.add(ContentProviderOperation.newUpdate(uri).withSelection(str, strArr).withValue(Columns.DATA, this.company).withValue(Columns.DATA_4, this.jobTitle).withValue(Columns.DATA_5, this.department).build());
        ContentProviderOperation.Builder builderWithValue2 = ContentProviderOperation.newUpdate(uri).withSelection(str, new String[]{this.contactId, "vnd.android.cursor.item/note"}).withValue(Columns.DATA, this.note);
        arrayList.add(builderWithValue2.build());
        builderWithValue2.withYieldAllowed(true);
        if (!TextUtils.isEmpty(this.photoUri) || !TextUtils.isEmpty(this.rawPhotoUri)) {
            Bitmap thumbnailBitmap = getThumbnailBitmap(TextUtils.isEmpty(this.rawPhotoUri) ? this.photoUri : this.rawPhotoUri);
            arrayList.add(ContentProviderOperation.newDelete(uri).withSelection(str, new String[]{this.rawContactId, "vnd.android.cursor.item/photo"}).build());
            arrayList.add(ContentProviderOperation.newInsert(uri).withValue("raw_contact_id", this.rawContactId).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/photo").withValue("data15", toByteArray(thumbnailBitmap)).build());
        }
        arrayList.add(ContentProviderOperation.newUpdate(ContactsContract.Contacts.CONTENT_URI).withSelection("_id=?", new String[]{this.contactId}).withValue(Columns.STARRED, Integer.valueOf(this.isFavorite ? 1 : 0)).build());
        String str2 = this.rawContactId;
        if (str2 != null) {
            for (String str3 : getBaseModelsContentType()) {
                arrayList.add(getFlushOperation(str3, str2));
            }
        }
        for (List<BaseModel> list : getBaseModels()) {
            Iterator<BaseModel> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getInsertOperation(this.rawContactId));
            }
        }
        return arrayList;
    }
}
