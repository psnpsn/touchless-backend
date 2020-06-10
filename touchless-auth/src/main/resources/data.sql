/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  psn
 * Created: Jun 7, 2020
 */


INSERT INTO oauth_client_details (client_id, client_secret, web_server_redirect_uri, scope, access_token_validity, refresh_token_validity, resource_ids, authorized_grant_types, additional_information) VALUES ('angular-app', '{bcrypt}$2y$10$6091leLVF7JabIu6zJ4dze5bXOh9QLAdvNYYdkS6kXNx1a87uInLC', 'http://localhost:8080/code', 'all', '3600', '10000', 'inventory,payment', 'authorization_code,password,refresh_token,implicit', '{}');
-- INSERT INTO permission (id, name) VALUES (1, 'create_profile');
-- INSERT INTO PERMISSION (id, name) VALUES (2, 'read_profile');
-- INSERT INTO PERMISSION (id, name) VALUES (3, 'update_profile');
-- INSERT INTO PERMISSION (id, name) VALUES(4, 'delete_profile');
-- INSERT INTO role (id, name) VALUES (1, 'ROLE_admin');
-- INSERT INTO role (id, name) VALUES (2, 'ROLE_operator');
-- INSERT INTO PERMISSION_ROLE (PERMISSION_ID, ROLE_ID) VALUES (1,1); /*create-> admin */
-- INSERT INTO PERMISSION_ROLE (PERMISSION_ID, ROLE_ID) VALUES (2,1); /* read admin */
-- INSERT INTO PERMISSION_ROLE (PERMISSION_ID, ROLE_ID) VALUES (3,1); /* update admin */
-- INSERT INTO PERMISSION_ROLE (PERMISSION_ID, ROLE_ID) VALUES (4,1); /* delete admin */
-- INSERT INTO PERMISSION_ROLE (PERMISSION_ID, ROLE_ID) VALUES (2,2);  /* read operator */
-- INSERT INTO PERMISSION_ROLE (PERMISSION_ID, ROLE_ID) VALUES (3,2);  /* update operator */
-- INSERT INTO USER (id, username,password, email, enabled, account_Non_Expired, credentials_Non_Expired, account_Non_Locked) VALUES ('1', 'iosys','{bcrypt}$2y$10$6091leLVF7JabIu6zJ4dze5bXOh9QLAdvNYYdkS6kXNx1a87uInLC', 'iosys@iosys.com', '1', '1', '1', '1');
-- INSERT INTO USER (id, username,password, email, enabled, account_Non_Expired, credentials_Non_Expired, account_Non_Locked) VALUES ('2', 'psn', '{bcrypt}$2y$10$3EWeT4WAkkQXQYltBJToxOxN9fU7mndj5hYNsVsJbYTVwyjwvyF8C','psn@psn.com', '1', '1', '1', '1');
-- INSERT INTO ROLE_USER (ROLE_ID, USER_ID) VALUES (1, 1); /* iosys-admin */
-- INSERT INTO ROLE_USER (ROLE_ID, USER_ID) VALUES (2, 2); /* psn-operatorr */