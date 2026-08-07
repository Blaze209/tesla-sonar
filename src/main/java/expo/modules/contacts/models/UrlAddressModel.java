package expo.modules.contacts.models;

import android.database.Cursor;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ImagesContract;
import expo.modules.contacts.Columns;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Lexpo/modules/contacts/models/UrlAddressModel;", "Lexpo/modules/contacts/models/BaseModel;", "<init>", "()V", CMSAttributeTableGenerator.CONTENT_TYPE, "", "getContentType", "()Ljava/lang/String;", "dataAlias", "getDataAlias", "getLabelFromCursor", "cursor", "Landroid/database/Cursor;", "expo-contacts_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UrlAddressModel extends BaseModel {
    private final String contentType = "vnd.android.cursor.item/website";
    private final String dataAlias = ImagesContract.URL;

    @Override // expo.modules.contacts.CommonProvider
    public String getContentType() {
        return this.contentType;
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getDataAlias() {
        return this.dataAlias;
    }

    @Override // expo.modules.contacts.models.BaseModel
    protected String getLabelFromCursor(Cursor cursor) {
        s.k(cursor, "cursor");
        String labelFromCursor = super.getLabelFromCursor(cursor);
        if (labelFromCursor != null) {
            return labelFromCursor;
        }
        switch (cursor.getInt(cursor.getColumnIndexOrThrow(Columns.TYPE))) {
            case 1:
                return "homepage";
            case 2:
                return "blog";
            case 3:
                return Scopes.PROFILE;
            case 4:
                return "home";
            case 5:
                return "work";
            case 6:
                return "ftp";
            case 7:
                return "other";
            default:
                return "unknown";
        }
    }
}
