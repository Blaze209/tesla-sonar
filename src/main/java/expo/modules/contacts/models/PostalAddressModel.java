package expo.modules.contacts.models;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.database.Cursor;
import android.provider.ContactsContract;
import com.google.android.libraries.places.api.model.PlaceTypes;
import expo.modules.contacts.Columns;
import java.util.Map;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lexpo/modules/contacts/models/PostalAddressModel;", "Lexpo/modules/contacts/models/BaseModel;", "<init>", "()V", "", AnnotatedPrivateKey.LABEL, "", "mapStringToType", "(Ljava/lang/String;)I", "Landroid/database/Cursor;", "cursor", "Ljn0/h0;", "fromCursor", "(Landroid/database/Cursor;)V", "", "", "readableMap", "fromMap", "(Ljava/util/Map;)V", "rawId", "Landroid/content/ContentProviderOperation;", "getInsertOperation", "(Ljava/lang/String;)Landroid/content/ContentProviderOperation;", "getLabelFromCursor", "(Landroid/database/Cursor;)Ljava/lang/String;", CMSAttributeTableGenerator.CONTENT_TYPE, "Ljava/lang/String;", "getContentType", "()Ljava/lang/String;", "dataAlias", "getDataAlias", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "contentValues", "expo-contacts_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PostalAddressModel extends BaseModel {
    private final String contentType = "vnd.android.cursor.item/postal-address_v2";
    private final String dataAlias = "formattedAddress";

    @Override // expo.modules.contacts.models.BaseModel
    public void fromCursor(Cursor cursor) {
        s.k(cursor, "cursor");
        super.fromCursor(cursor);
        putString(cursor, "formattedAddress", Columns.DATA);
        putString(cursor, "street", Columns.DATA_4);
        putString(cursor, "poBox", Columns.DATA_5);
        putString(cursor, PlaceTypes.NEIGHBORHOOD, Columns.DATA_6);
        putString(cursor, "city", Columns.DATA_7);
        putString(cursor, "region", Columns.DATA_8);
        putString(cursor, "state", Columns.DATA_8);
        putString(cursor, "postalCode", Columns.DATA_9);
        putString(cursor, PlaceTypes.COUNTRY, Columns.DATA_10);
    }

    @Override // expo.modules.contacts.models.BaseModel
    public void fromMap(Map<String, ? extends Object> readableMap) {
        s.k(readableMap, "readableMap");
        super.fromMap(readableMap);
        mapValue(readableMap, "region", "state");
    }

    @Override // expo.modules.contacts.CommonProvider
    public String getContentType() {
        return this.contentType;
    }

    @Override // expo.modules.contacts.models.BaseModel
    public ContentValues getContentValues() {
        ContentValues contentValues = super.getContentValues();
        contentValues.put(Columns.DATA_4, getString("street"));
        contentValues.put(Columns.DATA_7, getString("city"));
        contentValues.put(Columns.DATA_8, getString("region"));
        contentValues.put(Columns.DATA_10, getString(PlaceTypes.COUNTRY));
        contentValues.put(Columns.DATA_9, getString("postalCode"));
        return contentValues;
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
        ContentProviderOperation contentProviderOperationBuild = builderNewInsert.withValue(Columns.MIMETYPE, getContentType()).withValue(Columns.TYPE, getType()).withValue(Columns.DATA_4, getString("street")).withValue(Columns.DATA_7, getString("city")).withValue(Columns.DATA_8, getString("region")).withValue(Columns.DATA_9, getString("postalCode")).withValue(Columns.DATA_10, getString(PlaceTypes.COUNTRY)).build();
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
            return "home";
        }
        if (i11 != 2) {
            return i11 != 3 ? "unknown" : "other";
        }
        return "work";
    }

    @Override // expo.modules.contacts.models.BaseModel
    public int mapStringToType(String label) {
        if (label == null) {
            return 3;
        }
        int iHashCode = label.hashCode();
        if (iHashCode == 3208415) {
            return label.equals("home") ? 1 : 3;
        }
        if (iHashCode == 3655441) {
            return !label.equals("work") ? 3 : 2;
        }
        if (iHashCode != 106069776) {
            return 3;
        }
        label.equals("other");
        return 3;
    }
}
