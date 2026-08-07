package expo.modules.contacts.models;

import android.content.ContentValues;
import android.database.Cursor;
import expo.modules.contacts.Columns;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lexpo/modules/contacts/models/ImAddressModel;", "Lexpo/modules/contacts/models/BaseModel;", "<init>", "()V", "", "protocol", "", "serializeService", "(I)Ljava/lang/String;", "Landroid/database/Cursor;", "cursor", "Ljn0/h0;", "fromCursor", "(Landroid/database/Cursor;)V", CMSAttributeTableGenerator.CONTENT_TYPE, "Ljava/lang/String;", "getContentType", "()Ljava/lang/String;", "dataAlias", "getDataAlias", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "contentValues", "expo-contacts_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImAddressModel extends BaseModel {
    private final String contentType = "vnd.android.cursor.item/im";
    private final String dataAlias = "username";

    private final String serializeService(int protocol) {
        switch (protocol) {
            case -1:
                return "custom";
            case 0:
                return "aim";
            case 1:
                return "msn";
            case 2:
                return "yahoo";
            case 3:
                return "skype";
            case 4:
                return "qq";
            case 5:
                return "googleTalk";
            case 6:
                return "icq";
            case 7:
                return "jabber";
            case 8:
                return "netmeeting";
            default:
                return "unknown";
        }
    }

    @Override // expo.modules.contacts.models.BaseModel
    public void fromCursor(Cursor cursor) {
        s.k(cursor, "cursor");
        super.fromCursor(cursor);
        getMap().putString("service", serializeService(cursor.getInt(cursor.getColumnIndexOrThrow(Columns.DATA_5))));
    }

    @Override // expo.modules.contacts.CommonProvider
    public String getContentType() {
        return this.contentType;
    }

    @Override // expo.modules.contacts.models.BaseModel
    public ContentValues getContentValues() {
        ContentValues contentValues = super.getContentValues();
        contentValues.put(Columns.DATA_5, getString("service"));
        return contentValues;
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getDataAlias() {
        return this.dataAlias;
    }
}
