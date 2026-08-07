package expo.modules.contacts;

import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import expo.modules.contacts.models.DateModelKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u001a+\u0010\u000e\u001a\u0004\u0018\u0001H\u000f\"\u0004\b\u0000\u0010\u000f*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0002\u0010\u0013\"\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\"\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"toBundle", "Landroid/os/Bundle;", "Lexpo/modules/contacts/ContactPage;", "keys", "", "", "Lexpo/modules/contacts/Contact;", "defaultFields", "RC_EDIT_CONTACT", "", "RC_PICK_CONTACT", "RC_ADD_CONTACT", "DEFAULT_PROJECTION", "", "safeGet", "T", "", "", Action.KEY_ATTRIBUTE, "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;", "expo-contacts_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ContactsModuleKt {
    public static final int RC_ADD_CONTACT = 2139;
    public static final int RC_EDIT_CONTACT = 2137;
    public static final int RC_PICK_CONTACT = 2138;
    private static final Set<String> defaultFields = d1.i("phoneNumbers", "emails", "addresses", "note", DateModelKt.BIRTHDAY, "dates", "instantMessageAddresses", "urlAddresses", "extraNames", "relationships", "phoneticFirstName", "phoneticLastName", "phoneticMiddleName", "namePrefix", "nameSuffix", "name", EContextPaymentMethod.FIRST_NAME, "middleName", EContextPaymentMethod.LAST_NAME, "nickname", "id", "jobTitle", "company", "department", "image", "imageAvailable", "note", "isFavorite");
    private static final List<String> DEFAULT_PROJECTION = v.p("raw_contact_id", Columns.CONTACT_ID, Columns.LOOKUP_KEY, Columns.MIMETYPE, Columns.DISPLAY_NAME, Columns.PHOTO_URI, Columns.PHOTO_THUMBNAIL_URI, Columns.DATA, Columns.TYPE, Columns.DATA_5, Columns.LABEL, Columns.DATA_4, Columns.DATA_6, Columns.DATA_7, Columns.DATA_8, Columns.DATA_9, Columns.DATA, Columns.DATA_4, Columns.DATA_5, Columns.STARRED);

    public static final <T> T safeGet(Map<String, ? extends Object> map, String key) {
        s.k(map, "<this>");
        s.k(key, "key");
        T t11 = (T) map.get(key);
        if (t11 == null) {
            return null;
        }
        return t11;
    }

    public static final Bundle toBundle(ContactPage contactPage, Set<String> keys) {
        Collection collectionM;
        List<Contact> data;
        s.k(keys, "keys");
        if (contactPage == null || (data = contactPage.getData()) == null) {
            collectionM = v.m();
        } else {
            List<Contact> list = data;
            collectionM = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                collectionM.add(((Contact) it.next()).toMap(keys));
            }
        }
        boolean hasNextPage = contactPage != null ? contactPage.getHasNextPage() : false;
        boolean hasPreviousPage = contactPage != null ? contactPage.getHasPreviousPage() : false;
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data", new ArrayList<>(collectionM));
        bundle.putBoolean("hasNextPage", hasNextPage);
        bundle.putBoolean("hasPreviousPage", hasPreviousPage);
        return bundle;
    }

    public static final Bundle toBundle(Contact contact, Set<String> keys) {
        List listM;
        s.k(keys, "keys");
        Bundle map = contact != null ? contact.toMap(keys) : null;
        if (map == null || (listM = v.e(map)) == null) {
            listM = v.m();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data", new ArrayList<>(listM));
        bundle.putBoolean("hasNextPage", false);
        bundle.putBoolean("hasPreviousPage", false);
        return bundle;
    }
}
