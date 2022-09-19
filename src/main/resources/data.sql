insert into order_list(order_list_pk, user_serial) values (1, "serial_a");
insert into order_list(order_list_pk, user_serial) values (2, "serial_b");

insert into item(item_pk, product_name) values (1, "옷");
insert into item(item_pk, product_name) values (2, "과자");
insert into item(item_pk, product_name) values (3, "침대");

insert into order_item(order_item_pk, product_count, item_pk, order_list_pk) values (1, 2, 1, 1);
insert into order_item(order_item_pk, product_count, item_pk, order_list_pk) values (2, 5, 2, 1);
insert into order_item(order_item_pk, product_count, item_pk, order_list_pk) values (3, 10, 3, 2);
insert into order_item(order_item_pk, product_count, item_pk, order_list_pk) values (4, 3, 2, 2);
insert into order_item(order_item_pk, product_count, item_pk, order_list_pk) values (5, 3, 1, 2);