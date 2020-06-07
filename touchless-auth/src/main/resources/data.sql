/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  psn
 * Created: Jun 7, 2020
 */

INSERT INTO oauth_client_details (client_id, client_secret, web_server_redirect_uri, scope, access_token_validity, refresh_token_validity, resource_ids, authorized_grant_types, additional_information) VALUES ('angular-app', '{bcrypt}$2y$10$WHwL4jd5hHdb/jgAxPbR2e7Q9fN9xOy6ydREoKaZrXclZPfaJrcmW', 'http://localhost:8080/code', 'READ,WRITE', '3600', '10000', 'inventory,payment', 'authorization_code,password,refresh_token,implicit', '{}');

 INSERT INTO PERMISSION (NAME) VALUES
 ('create_profile'),
 ('read_profile'),
 ('update_profile'),
 ('delete_profile');

 INSERT INTO role (NAME) VALUES
	('ROLE_admin'),('ROLE_operator');

 INSERT INTO PERMISSION_ROLE (PERMISSION_ID, ROLE_ID) VALUES
     (1,1), /*create-> admin */
     (2,1), /* read admin */
     (3,1), /* update admin */
     (4,1), /* delete admin */
     (2,2),  /* read operator */
     (3,2);  /* update operator */
insert into user (id, username,password, email, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES ('1', 'iosys','{bcrypt}$2y$10$WHwL4jd5hHdb/jgAxPbR2e7Q9fN9xOy6ydREoKaZrXclZPfaJrcmW', 'iosys@iosys.com', '1', '1', '1', '1');
insert into  user (id, username,password, email, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES ('2', 'psn', '{bcrypt}$2y$10$3EWeT4WAkkQXQYltBJToxOxN9fU7mndj5hYNsVsJbYTVwyjwvyF8C','psn@psn.com', '1', '1', '1', '1');

INSERT INTO ROLE_USER (ROLE_ID, USER_ID)
    VALUES
    (1, 1) /* iosys-admin */,
    (2, 2) /* psn-operatorr */ ;