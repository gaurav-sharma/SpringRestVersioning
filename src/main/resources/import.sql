insert into device(name, is_smart, rate) values('iPhone 6', 1, 50);
insert into device(name, is_smart, rate) values('Samsung Galaxy S5', 1, 49.99);
insert into device(name, is_smart, rate) values('Phone Three', 0, 10.99);
insert into device(name, is_smart, rate) values('Phone Four', 0, 15.99);
insert into device(name, is_smart, rate) values('Phone Five', 0, 17.99);
insert into device(name, is_smart, rate) values('Phone Six', 0, 12.99);
insert into device(name, is_smart, rate) values('Phone Seven', 0, 15.99);
insert into device(name, is_smart, rate) values('Phone Eight', 0, 19.99);
insert into device(name, is_smart, rate) values('Phone Nine', 0, 18.99);
insert into device(name, is_smart, rate) values('Phone Ten', 0, 18.99);

insert into plan(name, plan_type, rate) values('$10 Voice plan', 'VOICE', 10.00);
insert into plan(name, plan_type, rate) values('$50 Voice, text and data bundle', 'VOICE_TEXT_DATA', 50.00);
insert into plan(name, plan_type, rate) values('$20 Voice and text plan', 'VOICE_TEXT', 20.00);

--Everybody has a VOICE plan
insert into device_plans(device_id, plans_id) values(1, 1);
insert into device_plans(device_id, plans_id) values(2, 1);
insert into device_plans(device_id, plans_id) values(3, 1);
insert into device_plans(device_id, plans_id) values(4, 1);
insert into device_plans(device_id, plans_id) values(5, 1);
insert into device_plans(device_id, plans_id) values(6, 1);
insert into device_plans(device_id, plans_id) values(7, 1);
insert into device_plans(device_id, plans_id) values(8, 1);
insert into device_plans(device_id, plans_id) values(9, 1);
insert into device_plans(device_id, plans_id) values(10, 1);

--Everybody has a VOICE_TEXT_DATA plan
insert into device_plans(device_id, plans_id) values(1, 2);
insert into device_plans(device_id, plans_id) values(2, 2);
insert into device_plans(device_id, plans_id) values(3, 2);
insert into device_plans(device_id, plans_id) values(4, 2);
insert into device_plans(device_id, plans_id) values(5, 2);
insert into device_plans(device_id, plans_id) values(6, 2);
insert into device_plans(device_id, plans_id) values(7, 2);
insert into device_plans(device_id, plans_id) values(8, 2);
insert into device_plans(device_id, plans_id) values(9, 2);
insert into device_plans(device_id, plans_id) values(10, 2);

--Only non-smartphones have VOICE_TEXT plan
insert into device_plans(device_id, plans_id) values(3, 3);
insert into device_plans(device_id, plans_id) values(4, 3);
insert into device_plans(device_id, plans_id) values(5, 3);
insert into device_plans(device_id, plans_id) values(6, 3);
insert into device_plans(device_id, plans_id) values(7, 3);
insert into device_plans(device_id, plans_id) values(8, 3);
insert into device_plans(device_id, plans_id) values(9, 3);
insert into device_plans(device_id, plans_id) values(10, 3);
