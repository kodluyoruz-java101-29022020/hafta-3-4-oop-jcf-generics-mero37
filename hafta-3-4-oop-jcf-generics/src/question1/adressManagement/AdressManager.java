package question1.adressManagement;


import java.util.ArrayList;
import java.util.List;

import question1.customerManagement.User;

public class AdressManager {
	
	public static void addAdress(User user, Adress adress) {
		if (user.getAdressList() == null) {
			List<Adress> adressList =new ArrayList<Adress>();
			adressList.add(adress);
		} else {
			user.getAdressList().add(adress);
		}

	}

	public static void removeAdress(User user, Adress adress) {
		if (user.getAdressList().contains(adress)) {
			user.getAdressList().remove(user.getAdressList().indexOf(adress));

		}

	}
}
