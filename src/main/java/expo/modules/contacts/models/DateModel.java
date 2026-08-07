package expo.modules.contacts.models;

import android.content.ContentProviderOperation;
import android.database.Cursor;
import android.provider.ContactsContract;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import expo.modules.contacts.Columns;
import java.util.Arrays;
import java.util.Locale;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, d2 = {"Lexpo/modules/contacts/models/DateModel;", "Lexpo/modules/contacts/models/BaseModel;", "<init>", "()V", CMSAttributeTableGenerator.CONTENT_TYPE, "", "getContentType", "()Ljava/lang/String;", "dataAlias", "getDataAlias", "mapStringToType", "", AnnotatedPrivateKey.LABEL, "getLabelFromCursor", "cursor", "Landroid/database/Cursor;", "getInsertOperation", "Landroid/content/ContentProviderOperation;", "rawId", "formatDateString", "expo-contacts_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DateModel extends BaseModel {
    private final String contentType = "vnd.android.cursor.item/contact_event";
    private final String dataAlias = InquiryField.DateField.TYPE;

    private final String formatDateString() {
        String data = getData();
        if (data != null) {
            return data;
        }
        Integer numValueOf = Integer.valueOf((int) getMap().getDouble("year", -1.0d));
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        Integer numValueOf2 = Integer.valueOf((int) getMap().getDouble("month", -1.0d));
        if (numValueOf2.intValue() < 0) {
            numValueOf2 = null;
        }
        Integer numValueOf3 = numValueOf2 != null ? Integer.valueOf(numValueOf2.intValue() + 1) : null;
        Integer numValueOf4 = Integer.valueOf((int) getMap().getDouble("day", -1.0d));
        if (numValueOf4.intValue() <= 0) {
            numValueOf4 = null;
        }
        if (numValueOf != null && numValueOf3 != null && numValueOf4 != null) {
            t0 t0Var = t0.f86535a;
            String str = String.format(Locale.US, "%04d-%02d-%02d", Arrays.copyOf(new Object[]{numValueOf, numValueOf3, numValueOf4}, 3));
            s.j(str, "format(...)");
            return str;
        }
        if (numValueOf3 == null || numValueOf4 == null) {
            return null;
        }
        t0 t0Var2 = t0.f86535a;
        String str2 = String.format(Locale.US, "--%02d-%02d", Arrays.copyOf(new Object[]{numValueOf3, numValueOf4}, 2));
        s.j(str2, "format(...)");
        return str2;
    }

    @Override // expo.modules.contacts.CommonProvider
    public String getContentType() {
        return this.contentType;
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getDataAlias() {
        return this.dataAlias;
    }

    @Override // expo.modules.contacts.models.BaseModel
    public ContentProviderOperation getInsertOperation(String rawId) {
        ContentProviderOperation.Builder builderNewInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
        s.j(builderNewInsert, "newInsert(...)");
        if (rawId == null) {
            builderNewInsert.withValueBackReference("raw_contact_id", 0);
        } else {
            builderNewInsert.withValue("raw_contact_id", rawId);
        }
        ContentProviderOperation contentProviderOperationBuild = builderNewInsert.withValue(Columns.MIMETYPE, getContentType()).withValue(Columns.TYPE, Integer.valueOf(mapStringToType(getLabel()))).withValue(Columns.DATA, formatDateString()).withValue(Columns.LABEL, getLabel()).build();
        s.j(contentProviderOperationBuild, "build(...)");
        return contentProviderOperationBuild;
    }

    @Override // expo.modules.contacts.models.BaseModel
    protected String getLabelFromCursor(Cursor cursor) {
        s.k(cursor, "cursor");
        String labelFromCursor = super.getLabelFromCursor(cursor);
        if (labelFromCursor != null) {
            return labelFromCursor;
        }
        int i11 = cursor.getInt(cursor.getColumnIndexOrThrow(Columns.TYPE));
        if (i11 == 1) {
            return "anniversary";
        }
        if (i11 != 2) {
            return i11 != 3 ? "unknown" : DateModelKt.BIRTHDAY;
        }
        return "other";
    }

    @Override // expo.modules.contacts.models.BaseModel
    public int mapStringToType(String label) {
        if (label == null) {
            return 0;
        }
        int iHashCode = label.hashCode();
        if (iHashCode == -940675184) {
            return label.equals("anniversary") ? 1 : 0;
        }
        if (iHashCode != 106069776) {
            return (iHashCode == 1069376125 && label.equals(DateModelKt.BIRTHDAY)) ? 3 : 0;
        }
        return !label.equals("other") ? 0 : 2;
    }
}
