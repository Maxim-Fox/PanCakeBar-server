package PanCakeBarServer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import PanCakeBarServer.models.ShopCart;
import PanCakeBarServer.models.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>, ItemFilter {
    void deleteFromShopCart(ShopCart shopCart, Item id);
}